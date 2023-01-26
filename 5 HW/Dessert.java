/**
 * This abstract class implements the Comparable interface and is made of basic information about a dessert.
 * @author hchoi395
 * @version 11.0.13
 */
public abstract class Dessert implements Comparable<Dessert> {
    private String flavor;
    private double sweetness;
    /**
     * This is a Dessert constructor that takes in 2 parameters.
     * @param flavor String parameter that represents the flavor of the dessert.
     * @param sweetness double parameter that represents the sweetness of the dessert.
     */
    public Dessert(String flavor, double sweetness) {
        this.flavor = flavor;
        this.sweetness = sweetness;
    }
    /**
     * This is a Dessert constructor that takes in no parameters.
     */
    public Dessert() {
        this("vanilla", 25);
    }
    /**
     * Getter method for flavor.
     * @return returns the String flavor.
     */
    public String getFlavor() {
        return flavor;
    }
    /**
     * Getter method for sweetness.
     * @return returns the double sweetness.
     */
    public double getSweetness() {
        return sweetness;
    }
    /**
     * Setter method for flavor.
     * @param flavor takes in a String parameter that will be set as flavor.
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    /**
     * Setter method for sweetness.
     * @param sweetness takes in a double parameter that will be set as sweetness.
     */
    public void setSweetness(double sweetness) {
        this.sweetness = sweetness;
    }
    @Override
    public String toString() {
        return String.format("This is a %s dessert with a sweetness of %.2f", flavor, sweetness);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof Dessert) {
            Dessert temp = (Dessert) o;
            return this.flavor.equals(temp.flavor) && this.sweetness == temp.sweetness;
        }
        return false;
    }
    @Override
    public int compareTo(Dessert o) {
        if (this.sweetness == o.sweetness) {
            return this.flavor.compareTo(o.flavor);
        }
        return (int) (this.sweetness - o.sweetness);
    }
}
