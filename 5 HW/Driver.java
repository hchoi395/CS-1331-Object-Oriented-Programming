public class Driver {
    public static void main(String[] args) {
        Store store1 = new Store("MyStore");
        Store store2 = new Store("your Store");
        Cake cake1 = new Cake("chocolate", 10, "grape");
        Cake cake2 = new Cake("vanilla", 20, "boba");
        Cake cake3 = new Cake("cherry");
        Cake cake4 = new Cake("chocolate", 10, "strawberry");
        IceCream ice1 = new IceCream("gushberry", 100, 5, true);
        IceCream ice2 = new IceCream("dlueberry", 10, 20, false);
        IceCream ice3 = new IceCream("alackberry", 5, 10, true);
        store1.addDessert(cake1);
        store1.addDessert(cake2);
        store1.addDessert(cake4);
        store1.addDessert(ice1);
        store1.addDessert(ice2);
        store1.addDessert(ice3);
        store1.addDessert(cake1);

        store2.addDessert(cake1);
        store2.addDessert(cake2);
        store2.addDessert(cake4);
        store2.addDessert(ice1);
        store2.addDessert(ice2);
        store2.addDessert(ice3);
        store2.addDessert(cake3);
        System.out.println(cake1.compareTo(ice1));

        System.out.println(store1.removeDessert(cake1));
        

        System.out.println(store1.findDessert(cake1));

        store1.findDessert(cake1);
        store1.findDessert(cake4);

        store1.sortStore();
        store2.sortStore();
        System.out.println(store1.getDesserts());
        System.out.println(store2.getDesserts());

        System.out.println(store1.checkStore(ice3));

        System.out.println(Bob.compareStores(store1, store2));

        System.out.println(Bob.shop(store1, cake3));
        System.out.println(Bob.shop(store2, cake3));
    }
}
