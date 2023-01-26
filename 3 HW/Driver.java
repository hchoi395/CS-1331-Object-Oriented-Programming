/**
 * This is the Driver class that will run the code of the other classes.
 * @author hchoi395
 * @version 11.0.13
 */
public class Driver {
    /**
     * This is the main method that calls the code of the other classes.
     * @param args args parameter
     */
    public static void main(String[] args) {
        Car car1 = new Car("1002", 0, new String[10], 20, 30, 500);
        Car car2 = new Car("1003");
        Car car3 = new Car("1003");
        System.out.println(car1.addPassenger(100, new String[10]));
        System.out.println(car3.equals(car2));
        System.out.println(car1.calculateCost(500));
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        Bus bus1 = new Bus("Bus1", 0, "Atlanta", 3);
        Bus bus2 = new Bus("Bus2", "Athens");
        System.out.println(bus1.addPassenger(10000, new String[1000]));
        System.out.println(bus2.addPassenger(100, new String[50]));
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
        System.out.println(bus1.equals(bus2));
    }
}
