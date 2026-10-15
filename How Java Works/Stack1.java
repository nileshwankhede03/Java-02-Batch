// java.lang.StackOverflowError

public class Stack1 {
    static int count = 0;

    static void test() {
        count++;
        System.out.println(count);
        test();
    }

    public static void main(String[] args) {
        test();
    }
}
