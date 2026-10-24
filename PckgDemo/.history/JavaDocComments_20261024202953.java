
public class JavaDocComments {

    /**
     * Calculates the total cost of an order, including tax.
     *
     * <p>
     * The tax rate is applied uniformly to the full order amount.
     *
     * @param quantity  the number of items being purchased
     * @param unitPrice the price of a single item, in rupees
     * @param taxRate   the tax rate to apply, expressed as a decimal
     * @return the final total including tax Nilesh
     * @throws IllegalArgumentException if quantity is negative
     */
    public static double calculateTotal(int quantity, double unitPrice, double taxRate) {
        if (quantity < 0) {
            throw new IllegalArgumentException("quantity cannot be negative");
        }
        double subtotal = quantity * unitPrice;
        return subtotal + (subtotal * taxRate);
    }

    public static void main(String[] args) {

    }
}