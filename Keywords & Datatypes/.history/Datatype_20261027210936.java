
class Datatype {
    public static void main(String[] args) {
        // Datatype variable_name = any_value;

        // whole Number
        // byte , short , int , long
        byte value1 = 127;
        value1++; // value1 = value1 + 1
        System.out.println("datatype byte : " + value1);

        short value2 = 32767;
        value2++;
        System.out.println("datatype short : " + value2);

        int value3 = 127;
        System.out.println("datatype int : " + value3);

        long value4 = 128L;
        System.out.println("datatype long ( L ) : " + value4);

        // MAX_VALUE
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        // Decimal Number (by fault double)
        // float,double

        float percentage = 95.78F;
        System.out.println("datatype float : " + percentage);

        double salary = 950000.87545678;
        System.out.println("datatype double : " + salary);

        // character
        // char
        char ch = 'N';
        System.out.println("datatype char : " + ch);

        // Boolean
        // Boolean -> 2 options => true / false
        boolean veg = true;
        boolean nonVeg = false;
        System.out.println("datatype boolean (True) : " + veg);
        System.out.println("datatype boolean (False) : " + nonVeg);

    }
}

/*
 * Syntax :
 * Datatype variable_name = any_value;
 * 
 * Datatype 2 types
 * 1.Primitive data type (8 types of datatype)
 * 2.Non-Primitive data type
 * 
 * Primitive data type :
 * 1.byte
 * 2.short
 * 3.char
 * 4.int
 * 5.long
 * 6.float
 * 7.double
 * 8.boolean
 */