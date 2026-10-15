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