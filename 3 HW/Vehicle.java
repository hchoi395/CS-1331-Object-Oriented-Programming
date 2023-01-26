/**
 * This class is an abstract class that sets up more specific vehicles with information that vehicles share.
 * @author hchoi395
 * @version 11.0.13
 */
public abstract class Vehicle {
    private final String id;
    private double earnings;
    protected int numMiles;
    protected String[] passengers;
    /**
     * This is a Vehicle constructor that takes in 3 parameters.
     * @param id String parameter that identifies a vehicle
     * @param numMiles int parameter representing the number of miles a vehicle has travelled
     * @param passengers String array parameter that represents the passengers on the vehicle
     */
    public Vehicle(String id, int numMiles, String[] passengers) {
        this.id = id;
        this.numMiles = numMiles;
        this.passengers = passengers;
        earnings = 0;
    }
    /**
     * This is a Vehicle constructor that takes in 2 parameters.
     * @param id String parameter that identifies a vehicle
     * @param passengers String array parameter that represents the passengers on the vehicle
     */
    public Vehicle(String id, String[] passengers) {
        this(id, 0, passengers);
    }
    /**
     * Getter method for earnings.
     * @return double earnings gets returned
     */
    public double getEarnings() {
        return earnings;
    }
    /**
     * Getter method for number of miles travelled by a vehicle.
     * @return int numMiles gets returned
     */
    public int getNumMiles() {
        return numMiles;
    }
    /**
     * Setter method for earnings.
     * @param earnings parameter double earnings gets set as earnings
     */
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
    /**
     * Setter method for number of miles travelled by a vehicle.
     * @param numMiles parameter int numMiles gets set as numMiles
     */
    public void setNumMiles(int numMiles) {
        this.numMiles = numMiles;
    }
    /**
     * Abstract method for whether or not a vehicle can drive a distance.
     * @param distance int parameter for distance
     * @return boolean is returned depending on if the vehicle can drive the distance or not.
     */
    public abstract boolean canDrive(int distance);
    /**
     * Abstract method that calculates the cost for a vehicle to travel a distance.
     * @param distance int parameter for distance
     * @return double that returns the cost for the vehicle to drive the distance
     */
    public abstract double calculateCost(int distance);
    /**
     * Abstract method for whether or not passengers can be added to a vehicle.
     * @param distance int parameter for distance
     * @param stringArray String array that contains people who want to become passengers
     * @return boolean on whether or not the passengers can be added to the vehicle
     */
    public abstract boolean addPassenger(int distance, String[] stringArray);
    /**
     * Method that increases the number of miles travelled by a vehicle and its earnings.
     * @param distance int parameter for distance
     */
    public void chargeRide(int distance) {
        if (canDrive(distance)) {
            setNumMiles(numMiles + distance);
            setEarnings(earnings + calculateCost(distance));
        }
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof Vehicle) {
            Vehicle temp = (Vehicle) other;
            return this.id.equals(temp.id) && this.numMiles == temp.numMiles;
        }
        return false;
    }
    @Override
    public String toString() {
        return String.format("%s has driven %d miles and has earned %.2f dollars.", id, numMiles, earnings);
    }
}
