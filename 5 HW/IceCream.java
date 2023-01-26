/**
 * This class is a child class of Dessert and stores information about icecream.
 * @author hchoi395
 * @version 11.0.13
 */
public class IceCream extends Dessert {
    private int scoops;
    private boolean cone;
    /**
     * IceCream constructor that takes in 4 parameters.
    * @param flavor String parameter that represents the flavor of the icecream.
     * @param sweetness double parameter that represents the sweetness of the icecream.
     * @param scoops int parameter that represents the amount of scoops of icecream.
     * @param cone boolean parameter that represents whether or not there is a cone.
     */
    public IceCream(String flavor, double sweetness, int scoops, boolean cone) {
        super(flavor, sweetness);
        this.scoops = scoops;
        this.cone = cone;
    }
    /**
     * IceCream constructor that takes in 2 parameters.
     * @param scoops int parameter that represents the amount of scoops of icecream.
     * @param cone boolean parameter that represents whether or not there is a cone.
     */
    public IceCream(int scoops, boolean cone) {
        this("vanilla", 45, scoops, cone);
    }
    /**
     * IceCream constructor that takes in no parameters.
     */
    public IceCream() {
        this("vanilla", 45, 1, false);
    }
    @Override
    public String toString() {
        String scoopsString;
        if (cone) {
            scoopsString = "has";
        } else {
            scoopsString = "does not have";
        }
        return String.format("This is a %s ice cream with %d scoops and %s a cone.", getFlavor(), scoops, scoopsString);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof IceCream) {
            IceCream temp = (IceCream) o;
            return super.equals(o) && this.scoops == temp.scoops && this.cone == temp.cone;
        }
        return false;
    }
}
