public class Test {
    String name;
    int value;
    boolean flag;
    Test test;

    void displayDefaultValues() {
        System.out.println("default value of name : " + this.name);
        System.out.println("default value of value : " + this.value);
        System.out.println("default value of flag : " + this.flag);
        System.out.println("default value of test : " + this.test);
    }

    public static void main(String[] args) {
        // Non - primitive data-type

        int a = 0;
        System.out.println(a);

        Test test = null;
        System.out.println(test);

        Test obj =  new Test();
        obj.displayDefaultValues();

    }
}

// Non-Primitive by default value is -> null
