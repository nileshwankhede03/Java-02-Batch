
public class NonPrimitiveDatatype {
    public static void main(String[] args) {
        int age = 23;
        NonPrimitiveDatatype obj = new NonPrimitiveDatatype();
        //                 ref variable = 

        System.out.println("NonPrimitiveDatatype value is : " + obj);
        System.out.println("age variable's value is : " + age);

        // NonPrimitiveDatatype value is : NonPrimitiveDatatype@7ad041f3
        // age variable's value is : 23
    }
}
/*
 * Primitive - directly values
 * Non-Primitive datatype -> reference (Address)
 * Non-Primitive datatype -> reference types
 * reference means address
 * (Unlimited)
 * 
 * common 4 Non-Primitive datatype
 * 1.Classes
 * 2.Interfaces
 * 3.String
 * 4.Arrays
 * 
 * memory :
 * primitive (value).
 * Non-primitive (reference)
 * 
 * variable -> stack memory section
 * Actual object values -> Heap memory section
 * 
 */