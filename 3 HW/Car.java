/**
 * This class extends the Vehicle class and represents information of a transportation car.
 * @author hchoi395
 * @version 11.0.13
 */
public class Car extends Vehicle {
    private double rate;
    private double fees;
    private int maxNumMiles;
    /**
     * Constructor for Car that has 6 parameters.
     * @param id String parameter that identifies a vehicle
     * @param numMiles int parameter representing the number of miles a vehicle has travelled
     * @param passengers String array parameter that represents the passengers on the vehicle
     * @param rate double parameter that represents how much 1 mile costs for the car
     * @param fees double parameter that represents a one time fee for car
     * @param maxNumMiles int parameter that represents the total miles the car can travel before retiring
     */
    public Car(String id, int numMiles, String[] passengers, double rate, double fees, int maxNumMiles) {
        super(id, numMiles, passengers);
        this.rate = rate;
        this.fees = fees;
        this.maxNumMiles = maxNumMiles;
    }
    /**
     * Constructor for Car that has 3 parameters.
     * @param id String parameter that identifies a vehicle
     * @param numMiles int parameter representing the number of miles a vehicle has travelled
     * @param maxNumMiles int parameter that represents the total miles the car can travel before retiring
     */
    public Car(String id, int numMiles, int maxNumMiles) {
        this(id, numMiles, new String[4], 10, 15, maxNumMiles);
    }
    /**
     * Constructor for Car that has 1 parameter.
     * @param id String parameter that identifies a vehicle
     */
    public Car(String id) {
        this(id, 0, new String[4], 10, 15, 200);
    }
    /**
     * Getter method for rate.
     * @return double rate is returned
     */
    public double getRate() {
        return rate;
    }
    /**
     * Getter method for fees.
     * @return double fee is returned
     */
    public double getFees() {
        return fees;
    }
    /**
     * Getter method for max number of miles that can be travelled.
     * @return int maxNumMiles is returned
     */
    public int getMaxNumMiles() {
        return maxNumMiles;
    }
    /**
     * Setter method for rate.
     * @param rate double parameter that will get set as rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }
    /**
     * Setter method for fees.
     * @param fees double parameter that will get set as fees
     */
    public void setFees(double fees) {
        this.fees = fees;
    }
    /**
     * Setter method for number of miles that can be travelled.
     * @param maxNumMiles int parameter that will get set as maxNumMiles
     */
    public void setMaxNumMiles(int maxNumMiles) {
        this.maxNumMiles = maxNumMiles;
    }
    @Override
    public boolean canDrive(int distance) {
        if (distance >= 0 && (numMiles + distance) <= maxNumMiles) {
            return true;
        }
        return false;
    }
    @Override
    public double calculateCost(int distance) {
        if (distance >= 0 && canDrive(distance)) {
            return rate * distance + fees;
        }
        return -1;
    }
    @Override
    public boolean addPassenger(int distance, String[] stringArray) {
        if (canDrive(distance) && stringArray.length <= passengers.length) {
            for (int i = 0; i < stringArray.length; i++) {
                passengers[i] = stringArray[i];
            }
            chargeRide(distance);
            return true;
        }
        return false;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof Car) {
            Car temp = (Car) other;
            return super.equals(other) && this.rate == temp.rate && this.fees == temp.fees
                && this.maxNumMiles == temp.maxNumMiles;
        }
        return false;
    }
    @Override
    public String toString() {
        return String.format("Car " + super.toString() + " It can only drive %d miles."
            + " It costs %.2f dollars per mile and there is a one-time fee of %.2f dollars.", maxNumMiles, rate, fees);
    }
}
