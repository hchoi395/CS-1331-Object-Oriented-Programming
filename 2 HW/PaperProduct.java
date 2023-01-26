/**
 * This class stores information about a paper product.
 * @author hchoi395
 * @version 11.0.13
 */
public class PaperProduct {
    private final String name;
    private int numberOfSheets;
    private final double weightOfUnitSheet;
    private static int totalProductsToShip = 10;
    public static final double COST_PER_GRAM = 0.025;
    /**
     * Creates a PaperProduct object that takes in 3 parameters.
     * @param name a String of the name of the product.
     * @param numberOfSheets a double of the number of sheets of the product.
     * @param weightOfUnitSheet a double of the weight of the sheets of the product.
     */
    public PaperProduct(String name, int numberOfSheets, double weightOfUnitSheet) {
        if (name != null && name.length() != 0) {
            this.name = name;
        } else {
            this.name = "A4";
        }
        this.setNumberOfSheets(numberOfSheets);
        if (weightOfUnitSheet >= 0) {
            this.weightOfUnitSheet = weightOfUnitSheet;
        } else {
            this.weightOfUnitSheet = 0.25;
        }
    }
    /**
     * Creates a PaperProduct object with 2 parameters.
     * @param name a String of the name of the product.
     * @param numberOfSheets an int of the number of sheets of the product.
     */
    public PaperProduct(String name, int numberOfSheets) {
        this(name, numberOfSheets, 0.25);
    }
    /**
     * Creates a PaperProduct object with 1 parameter.
     * @param name a String of the name of the product.
     */
    public PaperProduct(String name) {
        this(name, 500, 0.25);
    }
    /**
     * Creates a deep copy of the PaperProduct object passed in.
     * @param paperProduct the PaperProduct object that will be copied
     */
    public PaperProduct(PaperProduct paperProduct) {
        name = new String(paperProduct.name);
        numberOfSheets = paperProduct.numberOfSheets;
        weightOfUnitSheet = paperProduct.weightOfUnitSheet;
    }
    /**
     * Getter method for name.
     * @return a String of the name of the product
     */
    public String getName() {
        return name;
    }
    /**
     * Getter method for numberOfSheets.
     * @return an int of the number of sheets of the product
     */
    public int getNumberOfSheets() {
        return numberOfSheets;
    }
    /**
     * Getter method for weightOfUnitSheet.
     * @return a double of the weight of unit sheet of the product
     */
    public double getWeightOfUnitSheet() {
        return weightOfUnitSheet;
    }
    /**
     * Getter method for totalProductToShip.
     * @return an int of the total number of products to ship
     */
    public static int getTotalProductsToShip() {
        return totalProductsToShip;
    }
    /**
     * Setter method for numberOfSheets.
     * @param numberOfSheets an int of the number of sheets of the product.
     */
    public void setNumberOfSheets(int numberOfSheets) {
        if (numberOfSheets >= 0) {
            this.numberOfSheets = numberOfSheets;
        } else {
            this.numberOfSheets = 500;
        }
    }
    /**
     * Method that returns a double of the total weight for the product.
     * @return a double of the total weight of the product order
     */
    public double totalWeight() {
        return numberOfSheets * weightOfUnitSheet;
    }
    /**
     * Method that returns a double of the total cost for the product.
     * @return a double of the total cost of the product order
     */
    public double totalCost() {
        return totalWeight() * COST_PER_GRAM;
    }
    /**
     * Method that returns a String that represents the total weight, name, and total cost of the product.
     * @return a String of the total weight, name, and total cost
     */
    public String paperString() {
        return String.format("%.2fg of %s for $%.2f", totalWeight(), getName(), totalCost());
    }
    /**
     * A method that ships the paper product to a company depending on whether or not the warehouse is empty.
     * @param companyName a String that represents the company that the product is shipped to
     * @return a String based on whether or not the total product to ship is greater than 0 or not
     */
    public String ship(String companyName) {
        if (getTotalProductsToShip() != 0) {
            totalProductsToShip -= 1;
            return String.format("Shipped " + paperString() + " to " + companyName + ".");
        } else if (getTotalProductsToShip() == 0) {
            return String.format("Cannot ship any items, Warehouse is empty!");
        } else {
            return null;
        }
    }
}
