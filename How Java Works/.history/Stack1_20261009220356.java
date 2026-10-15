public class Stack1 {
    int count = 0;

    static void test() {
        count++;
        test();
    }

    public static void main(String[] args) {
        test();
    }
}
