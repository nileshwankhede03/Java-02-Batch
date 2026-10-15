
class Demo {
    void study() {
        System.out.println("do study for better tomorrow");
    }
}

public class ClassLifecycyle {

    static int a = 10;
    static String name = "Nilesh";
    static boolean isActive = true;

    static {
        System.out.println("Inside static block");
    }

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(name);
        System.out.println(isActive);
    }
}
