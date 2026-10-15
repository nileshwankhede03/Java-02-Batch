
public class Billing {
    public static void main(String[] args) {
        int total = calculateTotal(200);
        System.out.println("Total: " + total);
    }

    static int calculateTotal(int amount) {
        return addTax(amount);
    }

    static int addTax(int amount) {
        return amount + (amount * 18 / 100);
    }
}
