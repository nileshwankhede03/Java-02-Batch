
class Demo {
    public void displayGanesh() {
        int ans = 0; // local variable
        System.out.println("ans variable value is : " + ans);
        System.out.println("Jay Ganesh");
    }
}

public class TestX {
    public static void main(String[] args) {
        Demo obj = new Demo(); // obj -> this is a object
        obj.displayGanesh(); // method call
    }
}
// qwertyuiop