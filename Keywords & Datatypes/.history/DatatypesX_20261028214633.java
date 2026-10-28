import java.math.BigDecimal;

public class DatatypesX {
    public static void main(String[] args) {
        // 8 primitive datatypes
        // for whole numbers
        // byte
        // short
        // int
        // long
        byte value1 = 62;
        System.out.println(value1);
        System.out.println("Byte range is " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        short value2 = 62;
        System.out.println(value2);

        int age = 17;
        System.out.println(age);

        long price = 9L;
        System.out.println(price);

        // decimal values (float, double) (by default double)
        float percentage = 35.99f; // ~7 : significant digits
        System.out.println(percentage);
        float valueX = 47.58529f;

        double salary = 150789; // ~15-16 : significant digits
        double valueDouble = 87.68736475656787;
        System.out.println(salary);

        double a = 0.1;
        double b = 0.2;

        System.out.println(a + b);
        // 0.30000000000000004

        BigDecimal a1 = new BigDecimal("0.1");
        BigDecimal b1 = new BigDecimal("0.2");

        System.out.println(a1.add(b1)); // 0.3


        // char
        char ch = 'a'; // null character

        // boolea


        // Byte range is -128 to 127

        // +
        // 1.concat
        // 2.Addition

        // text + 62
        // "My roll number is : " + value
        // My roll number is : 62
    }
}
