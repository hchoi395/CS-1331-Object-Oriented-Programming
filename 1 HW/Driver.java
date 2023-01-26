public class Driver {
    public static void main(String[] args) {
        GarageOwner me = new GarageOwner("Han", 19);
        Garage myGarage = new Garage(me, new Car[3]);
        Car car1 = new Car(1990, "Camry", "Toyota", "white", 90);
        Car car2 = new Car(2020, "SuperFast", "Ferrari");
        Car car3 = new Car();
        System.out.println(car1.getIsRestored());
        car1.setConditionCategory(50);
        System.out.println(car1.getIsRestored());
        myGarage.addCar(0, car2);
        myGarage.addCar(1, car1);
        myGarage.addCar(2, car3);
        myGarage.sellCar(2);
        System.out.println(me.getCarsOwned());
        myGarage.showCertainCars(50);
    }
}
