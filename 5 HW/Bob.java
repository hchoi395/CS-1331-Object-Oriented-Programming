/**
 * This class represents Bob's behaviors.
 * @author hchoi395
 * @version 11.0.13
 */
public class Bob {
    /**
     * Method that takes in 2 Stores and returns whether or not store1's desserts exist in store2.
     * @param store1 Store parameter of the first store.
     * @param store2 Store parameter of the second store.
     * @return returns boolean true of false.
     */
    public static boolean compareStores(Store store1, Store store2) {
        for (int i = 0; i < store1.getDesserts().size(); i++) {
            if (store2.findDessert(store1.getDesserts().get(i)) == null) {
                return false;
            }
        }
        return true;
    }
    /**
     * Method that sorts the Store's desserts and returns whether or not a Dessert was found.
     * @param store Store parameter that will be sorted.
     * @param dessert Dessert parameter that will be searched for.
     * @return returns boolean true or false.
     */
    public static boolean shop(Store store, Dessert dessert) {
        store.sortStore();
        if (store.findDessert(dessert) != null) {
            return true;
        }
        return false;
    }
}
