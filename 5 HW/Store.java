import java.util.ArrayList;
/**
 * This class stores information about a store that sells desserts.
 * @author hchoi395
 * @version 11.0.13
 */
public class Store {
    private String name;
    private ArrayList<Dessert> desserts;
    /**
     * Store constructor that takes in 1 parameter.
     * @param name String parameter that represents the name of the store.
     */
    public Store(String name) {
        this.name = name;
        this.desserts = new ArrayList<Dessert>();
    }
    /**
     * Getter method for name.
     * @return returns a String of the name.
     */
    public String getName() {
        return name;
    }
    /**
     * Getter method for desserts.
     * @return returns an ArrayList that takes in Desserts called desserts.
     */
    public ArrayList<Dessert> getDesserts() {
        return desserts;
    }
    /**
     * Method that takes in a Dessert and adds it to the end of desserts.
     * @param dessert Dessert that will be added.
     */
    public void addDessert(Dessert dessert) {
        desserts.add(dessert);
    }
    /**
     * Method that takes in a Dessert and removes the first instance of it.
     * @param dessert Dessert that will be removed.
     * @return returns the Dessert that was removed.
     */
    public Dessert removeDessert(Dessert dessert) {
        for (int i = 0; i < desserts.size(); i++) {
            if (desserts.get(i).equals(dessert)) {
                Dessert temp = desserts.get(i);
                desserts.remove(dessert);
                return temp;
            }
        }
        return null;
    }
    /**
     * Method that finds a Dessert.
     * @param dessert Dessert parameter that will be found in desserts.
     * @return returns the Dessert that was found.
     */
    public Dessert findDessert(Dessert dessert) {
        int low = 0;
        int high = desserts.size() - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            Dessert value = desserts.get(middle);
            if (middle < desserts.indexOf(dessert)) {
                low = middle + 1;
            } else if (middle > desserts.indexOf(dessert)) {
                high = middle - 1;
            } else {
                return value;
            }
        }
        return null;
    }
    /**
     * Method that sorts desserts in ascending order based on sweetness and flavor.
     */
    public void sortStore() {
        for (int i = 0; i < desserts.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < desserts.size(); j++) {
                if (desserts.get(min).compareTo(desserts.get(j)) > 0) {
                    min = j;
                }
            }
            Dessert temp = desserts.get(i);
            desserts.set(i, desserts.get(min));
            desserts.set(min, temp);
        }
    }
    /**
     * Method that takes in a Dessert and returns the number of desserts in the store greater or equal to it.
     * @param dessert Dessert parameter that will be compared.
     * @return int of how many Desserts were greater than or equal.
     */
    public int checkStore(Dessert dessert) {
        int check = 0;
        for (int i = 0; i < desserts.size(); i++) {
            if (desserts.get(i).compareTo(dessert) >= 0) {
                check++;
            }
        }
        return check;
    }
}
