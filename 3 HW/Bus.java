/**
 * This class extends Vehicle and represents information of a regular transportation bus.
 * @author hchoi395
 * @version 11.0.13
 */
public class Bus extends Vehicle {
    private String location;
    private int stopsPerMile;
    /**
     * Constructor for Bus that has 4 parameters.
     * @param id String parameter that identifies a vehicle
     * @param numMiles int parameter representing the number of miles a vehicle has travelled
     * @param location String parameter that represents the route of the bus
     * @param stopsPerMile int parameter that represents frequence of bus stops per mile
     */
    public Bus(String id, int numMiles, String location, int stopsPerMile) {
        super(id, numMiles, new String[20]);
        this.location = location;
        this.stopsPerMile = stopsPerMile;
    }
    /**
     * Constructor for Bus that takes 2 parameters.
     * @param id String parameter that identifies a vehicle
     * @param location String parameter that represents the route of the bus
     */
    public Bus(String id, String location) {
        this(id, 0, location, 2);
        this.passengers = new String[20];
    }
    /**
     * Getter method for location of bus.
     * @return returns String location
     */
    public String getLocation() {
        return location;
    }
    /**
     * Getter method for number of stops per mile.
     * @return returns int stopsPerMile
     */
    public int getStopsPerMile() {
        return stopsPerMile;
    }
    /**
     * Setter method for location of bus.
     * @param location String parameter that will get set as location
     */
    public void setLocation(String location) {
        this.location = location;
    }
    /**
     * Setter method for number of stops per mile.
     * @param stopsPerMile int parameter that will get set as stopsPerMile
     */
    public void setStopsPerMile(int stopsPerMile) {
        this.stopsPerMile = stopsPerMile;
    }
    @Override
    public boolean canDrive(int distance) {
        if (distance >= 0) {
            return true;
        }
        return false;
    }
    @Override
    public double calculateCost(int distance) {
        if (canDrive(distance)) {
            return (distance * 3) / stopsPerMile;
        }
        return -1;
    }
    @Override
    public boolean addPassenger(int distance, String[] stringArray) {
        if (canDrive(distance)) {
            for (int i = 0; i < passengers.length; i++) {
                if (passengers[i] == null) {
                    passengers[i] = stringArray[i];
                    setEarnings(getEarnings() + calculateCost(distance));
                }
            }
            setNumMiles(numMiles + distance);
            return true;
        }
        return false;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof Bus) {
            Bus temp = (Bus) other;
            return super.equals(other) && this.location.equals(temp.location) && this.stopsPerMile == temp.stopsPerMile;
        }
        return false;
    }
    @Override
    public String toString() {
        return String.format("Bus " + super.toString()
            + " This bus drives around %s and makes %d stops per mile.", location, stopsPerMile);
    }
}
