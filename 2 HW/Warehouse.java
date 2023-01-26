/**
 * This class is the driver and will test the other classes.
 * @author hchoi395
 * @version 11.0.13
 */
public class Warehouse {
    /**
     * Main method of the program.
     * @param args takes in a String args
     */
    public static void main(String[] args) {
        PaperProduct a = new PaperProduct("", 20, 100);
        PaperProduct b = new PaperProduct("b");
        PhotoPaper aa = new PhotoPaper("", 20, 100, 50);
        PhotoPaper bb = new PhotoPaper("bb");
        GoldenTicket ticket = new GoldenTicket("Kumbaya", -1);
        DiscountedPaper aaa = new DiscountedPaper("", 20, 100, -1, ticket);
        DiscountedPaper bbb = new DiscountedPaper("bbb");
        System.out.println(a.ship("google"));
        System.out.println(b.ship("amazon"));
        System.out.println(aa.shipPhoto("google"));
        System.out.println(bb.shipPhoto("amazon"));
        System.out.println(aaa.shipDiscounted("google"));
        System.out.println(bbb.shipDiscounted("amazon"));
        System.out.println(aaa.botherAccounting());
        System.out.println(bbb.botherAccounting());
    }
}
