
public class Test {
    String name;
    int value;
    boolean flag;

    void displayDefaultValues(){
        System.out.println("default value of name : "  + this.name);
        System.out.println("default value of value : ");
        System.out.println("default value of : flag ");
    }
    public static void main(String[] args) {
        // Non - primitive data-type

        int a = 0;
        System.out.println(a);

        Test test = null;
        System.out.println(test);

    }
}

// Non-Primitive by default value is -> null
