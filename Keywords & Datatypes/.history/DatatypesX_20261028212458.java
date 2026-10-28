
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

        double salary = 150789; // ~15-16 : significant digits
        System.out.println(salary);

        // Byte range is -128 to 127

        // +
        // 1.concat
        // 2.Addition

        // text + 62
        // "My roll number is : " + value
        // My roll number is : 62
    }
}
