/**
 * This class extends PaperProduct and stores information about the Discount Paper Product.
 * @author hchoi395
 * @version 11.0.13
 */
public class DiscountedPaper extends PaperProduct {
    private double discount;
    private GoldenTicket ticket;
    /**
     * Creates a DiscountedPaper object that takes in 5 parameters.
     * @param name a String of the name of the product
     * @param numberOfSheets an int of the number of sheets of the product
     * @param weightOfUnitSheet a double of the weight of the product
     * @param discount a double of the discount of the product
     * @param ticket a GoldenTicket that has a catchphrase and a discount
     */
    public DiscountedPaper(String name, int numberOfSheets, double weightOfUnitSheet,
        double discount, GoldenTicket ticket) {
        super(name, numberOfSheets, weightOfUnitSheet);
        this.setDiscount(discount);
        this.setTicket(ticket);
    }
    /**
     * Creates a DiscountedPaper object that takes in 2 parameters.
     * @param name a String of the name of the product
     * @param numberOfSheets an int of the number of sheets of the product
     */
    public DiscountedPaper(String name, int numberOfSheets) {
        this(name, numberOfSheets, 0.25, 15, null);
    }
    /**
     * Creates a DiscountedPaper object that takes in 1 parameter.
     * @param name a String of the name of the product
     */
    public DiscountedPaper(String name) {
        this(name, 500, 0.25, 15, null);
    }
    /**
     * Creates a deep copy of a DiscountedPaper object passed in.
     * @param discountedPaper the DiscountedPaper object that will be passed in
     */
    public DiscountedPaper(DiscountedPaper discountedPaper) {
        super(new String(discountedPaper.getName()), discountedPaper.getNumberOfSheets(),
            discountedPaper.getWeightOfUnitSheet());
        this.discount = discountedPaper.getDiscount();
        this.setTicket(new GoldenTicket(discountedPaper.ticket.getCatchphrase(),
            discountedPaper.ticket.getDiscount()));
    }
    /**
     * Getter method for the discount of the product.
     * @return a double of the discount of the product
     */
    public double getDiscount() {
        return discount;
    }
    /**
     * Getter method for the GoldenTicket of the product.
     * @return a GoldenTicket of the product
     */
    public GoldenTicket getTicket() {
        return ticket;
    }
    /**
     * Setter method for the discount of the product.
     * @param discount a double of the discount of the product
     */
    public void setDiscount(double discount) {
        if (discount > 0 && discount <= 50) {
            this.discount = discount;
        } else {
            this.discount = 15;
        }
    }
    /**
     * Setter method for the GoldenTicket of the product.
     * @param ticket a GoldenTicket of the product
     */
    public void setTicket(GoldenTicket ticket) {
        if (ticket != null) {
            this.ticket = ticket;
        } else {
            this.ticket = null;
        }
    }
    /**
     * Method that calculates the discounted cost of the product based on whether a ticket exists or not.
     * @return a double of the discountedCost of the product
     */
    public double discountedCost() {
        double discountedCost = totalCost() - (getDiscount() * .01 * totalCost());
        if (ticket != null) {
            discountedCost -= (ticket.getDiscount() * .01 * discountedCost);
        }
        return discountedCost;
    }
    /**
     * Helper method that returns a String of the discounted cost of the product.
     * @return a String of the discounted cost of the product
     */
    public String costHelper() {
        return String.format("The total cost after the discount is %.2f", discountedCost());
    }
    /**
     * Method ships product and displays the discounted cost depending on whether or not the warehouse is empty.
     * @param companyName a String of the company's name
     * @return a String based on whether or not the total product to ship is greater than 0 or not
     */
    public String shipDiscounted(String companyName) {
        return String.format(ship(companyName) + " " + costHelper());
    }
    /**
     * Method that returns a String of the Discounted Paper Product and it's details.
     * @return a String of the details of the Discounted Paper Product
     */
    public String botherAccounting() {
        double ticketDiscount;
        if (ticket == null) {
            ticketDiscount = 0;
        } else {
            ticketDiscount = ticket.getDiscount();
        }
        return String.format("Discounted Paper Product:\nOriginal Cost: %.2f\n"
        + "Final Cost: %.2f\nOriginal Discount: %.2f%%\n"
        + "Golden Ticket Discount: %.2f%%", totalCost(), discountedCost(), getDiscount(), ticketDiscount);
    }
}
