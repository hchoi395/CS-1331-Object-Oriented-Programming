/**
 * This class extends PaperProduct and stores information about the Photo Paper stock in the warehouse.
 * @author hchoi395
 * @version 11.0.13
 */
public class PhotoPaper extends PaperProduct {
    private double glossiness;
    /**
     * Creates a PhotoPaper object that takes in 4 parameters.
     * @param name a String of the name of the product
     * @param numberOfSheets a double of the number of sheets of the product
     * @param weightOfUnitSheet a double of the weight of the product
     * @param glossiness a double of the glossiness of the product
     */
    public PhotoPaper(String name, int numberOfSheets, double weightOfUnitSheet, double glossiness) {
        super(name, numberOfSheets, weightOfUnitSheet);
        this.setGlossiness(glossiness);
    }
    /**
     * Creates a PhotoPaper object that takes in 2 parameters.
     * @param name a String of the name of the product
     * @param numberOfSheets a double of the number of sheets of the product
     */
    public PhotoPaper(String name, int numberOfSheets) {
        this(name, numberOfSheets, 0.25, 70);
    }
    /**
     * Creates a PhotoPaper object that takes in 1 parameter.
     * @param name a String of the name of the product
     */
    public PhotoPaper(String name) {
        this(name, 500, 0.25, 70);
    }
    /**
     * Creates a deep copy of the PhotoPaper object passed in.
     * @param photoPaper the PhotoPaper object that will be copied
     */
    public PhotoPaper(PhotoPaper photoPaper) {
        this(new String(photoPaper.getName()), photoPaper.getNumberOfSheets(),
            photoPaper.getWeightOfUnitSheet(), photoPaper.getGlossiness());
    }
    /**
     * Getter method for the glossiness of the product.
     * @return a double of the glossiness of the product
     */
    public double getGlossiness() {
        return glossiness;
    }
    /**
     * Setter method for the glossiness of the product.
     * @param glossiness a double of the glossiness of the product
     */
    public void setGlossiness(double glossiness) {
        if (glossiness >= 0 && glossiness <= 100) {
            this.glossiness = glossiness;
        } else {
            this.glossiness = 70;
        }
    }
    /**
     * Method that returns a String representing the glossiness, total weight, name, and total cost of the product.
     * @return a String representing the glossiness, total weight, name, and total cost of the product
     */
    public String photoString() {
        return String.format("%.2f%% glossy and %s", getGlossiness(), paperString());
    }
    /**
     * Method that ships the photo paper to a company depending on whether or not the warehouse is empty or not.
     * @param companyName a String of the company's name
     * @return a String based on whether or not the total product to ship is greater than 0 or not
     */
    public String shipPhoto(String companyName) {
        return String.format("Paper is %.2f glossy. %s", getGlossiness(), ship(companyName));
    }
}
