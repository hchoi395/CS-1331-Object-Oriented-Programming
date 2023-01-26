/**
 * This class is a child class of Dessert and stores information about a cake.
 * @author hchoi395
 * @version 11.0.13
 */
public class Cake extends Dessert {
    private String frosting;
    /**
     * Cake constructor that takes in 3 parameters.
     * @param flavor String parameter that represents the flavor of the cake.
     * @param sweetness double parameter that represents the sweetness of the cake.
     * @param frosting String parameter that represents the frosting of the cake.
     */
    public Cake(String flavor, double sweetness, String frosting) {
        super(flavor, sweetness);
        this.frosting = frosting;
    }
    /**
     * Cake constructor that takes in 1 parameter.
     * @param flavor String parameter that represents the flavor of the cake.
     */
    public Cake(String flavor) {
        this(flavor, 45, "vanilla");
    }
    @Override
    public String toString() {
        return String.format("This is a %s cake with a %s frosting and has a sweetness of %.2f",
            getFlavor(), frosting, getSweetness());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof Cake) {
            Cake temp = (Cake) o;
            return super.equals(o) && this.frosting.equals(temp.frosting);
        }
        return false;
    }
}
