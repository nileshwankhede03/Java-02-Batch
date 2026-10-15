public class Test {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10_000_000; i++) {
            add(i, i);
        }
    }
}