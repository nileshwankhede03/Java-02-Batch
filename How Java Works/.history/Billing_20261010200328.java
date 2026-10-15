
public class Billing {

    static int calculateTotal(int amount) {
        return addTax(amount);
    }

    static int addTax(int amount) {
        return amount + (amount * 18 / 100); // 200 +  36
    }

    public static void main(String[] args) {
        int total = calculateTotal(200);
        System.out.println("Total: " + total);
    }
}
