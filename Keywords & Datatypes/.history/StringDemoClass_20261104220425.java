
public class StringDemoClass {
    public static void main(String[] args) {
        // String 2 methods
        String name1 = "Nilesh"; // method 1
        String name2 = new String("Nilesh"); // method 2

        // to used for Strings comparison
        // 1. == operator (only compare references)
        // 2. .equals() method (Preferred) WORKS ON OBJECTS -> returns boolean

        System.out.println("Reference of name1 : " + System.identityHashCode(name1)); // 2060468723
        System.out.println("Reference of name2 : " + System.identityHashCode(name2)); // 1933863327

        boolean result = name1 == name2;
        System.out.println(result);

        String carName1 = "BMW";
        String carName2 = "BMW";

        System.out.println("Reference of carName1 : " + System.identityHashCode(carName1)); // 112810359
        System.out.println("Reference of carName2 : " + System.identityHashCode(carName2)); // 112810359

        System.out.println(carName1 == carName2); // true

        // 2. .equals() method (Preferred)
        System.out.println();

    }
}