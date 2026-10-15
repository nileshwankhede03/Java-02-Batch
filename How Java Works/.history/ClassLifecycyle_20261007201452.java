class Demo {
    void study() { // 500X
        System.out.println("do study for better tomorrow");
    }
}

/*
(Demo class)100X --> (Demo.study()) 500X
*/

public class ClassLifecycyle {
    // Prepare madhla code
    static int a = 0;
    static String name = null;
    static boolean isActive = false;

    // static int a = 10;
    // static String name = "Nilesh";
    // static boolean isActive = true;

    static {
        System.out.println("Inside static block");
    }

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.study();

        System.out.println(a);
        System.out.println(name);
        System.out.println(isActive);
    }
}

/*
 * 1. class load (JVM) in memory
 * 2. Links to 3 things
 * a. Verify => bytecode jo aahe tyala verify karrte before run
 * b.prepare => static fields (static variables) allocate (initialize with its
 * Default value)
 * c.resolve => symblic references connect to real ones
 * (symbols la tyancha reference (address) shi connect krrto)
 * 
 * Initilization : static fields (variables) la value initialize krrte
 * 
 * Use Program before runs : ready to use program & run
 * 
 * Unloading : class garbage collected (jar class ha unused asel trr to garbage
 * collector destroy krrto memory madhun)
 */