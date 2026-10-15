public class Main {

    static void method3() {
        int a = 10;
        int b = 0;
        int c = a / b; // Breakpoint इथे लावा
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {
        method1();
    }
}

/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at Main.method3(Main.java:6)
 * at Main.method2(Main.java:10)
 * at Main.method1(Main.java:14)
 * at Main.main(Main.java:18)
 */