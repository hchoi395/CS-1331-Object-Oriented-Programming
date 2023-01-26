/**
 * This class stores information about the Golden Ticket that customers can use to get an additional discounted price.
 * @author hchoi395
 * @version 11.0.13
 */
public class GoldenTicket {
    private String catchphrase;
    private double discount;
    /**
     * Creates a GoldenTicket object that takes in 2 parameters.
     * @param catchphrase a String of the catchphrase printed on the ticket
     * @param discount a double of the discount given by the ticket
     */
    public GoldenTicket(String catchphrase, double discount) {
        this.setCatchphrase(catchphrase);
        this.setDiscount(discount);
    }
    /**
     * Getter method for the catchphrase on the ticket.
     * @return a String of the catchphrase on the ticket
     */
    public String getCatchphrase() {
        return catchphrase;
    }
    /**
     * Getter method for the discount given by the ticket.
     * @return a double of the discount given by the ticket
     */
    public double getDiscount() {
        return discount;
    }
    /**
     * Setter method for the catchphrase on the ticket.
     * @param catchphrase a String of the catchphrase on the ticket
     */
    public void setCatchphrase(String catchphrase) {
        if (catchphrase != null && catchphrase.length() != 0) {
            this.catchphrase = catchphrase;
        } else {
            this.catchphrase = "Congrats!";
        }
    }
    /**
     * Setter method for the discount given by the ticket.
     * @param discount a double of the discount given by the ticket
     */
    public void setDiscount(double discount) {
        if (discount > 0 && discount <= 25) {
            this.discount = discount;
        } else {
            this.discount = 15.0;
        }
    }
    /**
     * Method that returns a String of the ticket's discount and catchphrase.
     * @return a String that represents the ticket's discount and catchphrase
     */
    public String ticketString() {
        return String.format("Golden Ticket with a %.2f%% discount! %s", getDiscount(), getCatchphrase());
    }
}
