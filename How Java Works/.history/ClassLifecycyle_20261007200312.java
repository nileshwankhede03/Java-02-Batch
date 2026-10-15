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

/*
 * 1. class load (JVM) in memory
 * 2. Links to 3 things
 * a. Verify => bytecode jo aahe tyala verify karrte before run
 * b.prepare => 
 * c.resolve
 */