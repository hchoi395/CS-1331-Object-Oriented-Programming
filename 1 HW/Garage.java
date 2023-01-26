public class Garage {
    private GarageOwner theOwner;
    private Car[] carCatalogue;
    public Garage(GarageOwner theOwner, Car[] carCatalogue) {
        this.setTheOwner(theOwner);
        this.setCarCatalogue(carCatalogue);
    }
    public Garage() {
        theOwner = new GarageOwner("Enzo Ferrari", 35);
        carCatalogue = new Car[4];
    }
    public Car addCar(int index, Car car) {
        if (index >= carCatalogue.length || car == null || index < 0) {
            System.out.println("Cannot add a car to this spot.");
            return null;
        } else if (carCatalogue[index] != null) {
            Car previousCar = carCatalogue[index];
            carCatalogue[index] = car;
            System.out.println("There was a " + previousCar.getColor()
                + " " + previousCar.getYear() + " " + previousCar.getMake()
                + " " + previousCar.getModel() + " here before.");
            return previousCar;
        } else if (carCatalogue[index] == null) {
            carCatalogue[index] = car;
            System.out.println("A " + car.getColor() + " " + car.getYear()
                + " " + car.getMake() + " " + car.getModel() + " was just parked here.");
            theOwner.setCarsOwned(theOwner.getCarsOwned() + 1);
            return null;
        } else {
            return null;
        }
    }
    public Car sellCar(int index) {
        if (index >= carCatalogue.length || index < 0 || carCatalogue[index] == null) {
            System.out.println("There was no car to sell!");
            return null;
        } else if (carCatalogue[index] != null) {
            Car previousCar = carCatalogue[index];
            System.out.println(theOwner.getName() + " just sold a "
                + carCatalogue[index].getColor() + " " + carCatalogue[index].getYear()
                + " " + carCatalogue[index].getMake() + " " + carCatalogue[index].getModel() + ".");
            carCatalogue[index] = null;
            theOwner.setCarsOwned(theOwner.getCarsOwned() - 1);
            return previousCar;
        } else {
            return null;
        }
    }
    public void showCertainCars(int conditionCategory) {
        for (int i = 0; i < carCatalogue.length; i++) {
            if (carCatalogue[i] != null && carCatalogue[i].getConditionCategory() > conditionCategory) {
                System.out.println("A " + carCatalogue[i].getColor()
                    + " " + carCatalogue[i].getYear() + " " + carCatalogue[i].getMake()
                    + " " + carCatalogue[i].getModel() + " with a condition category of "
                    + carCatalogue[i].getConditionCategory() + ".");
            }
        }
    }
    public GarageOwner getTheOwner() {
        return theOwner;
    }
    public Car[] getCarCatalogue() {
        return carCatalogue;
    }
    public void setTheOwner(GarageOwner theOwner) {
        this.theOwner = theOwner;
    }
    public void setCarCatalogue(Car[] carCatalogue) {
        this.carCatalogue = carCatalogue;
    }
}
