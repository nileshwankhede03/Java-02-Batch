
public class Point {
    int x, y; // Instance field (Instance == object variable)

    // Point(20, 30)
    Point(int value1, int value2) { // parameters
        System.out.println("constructor called");
        System.out.println("in value1 : " + value1);
        System.out.println("in value2 : " + value2);

        System.out.println("value of this keyword : " + this);

        this.x = value1;
        this.y = value2;

        this.
    }

    // this -> refers to current object

    public static void main(String[] args) {
        // obj creation
        Point p = new Point(20, 30); // arguments
        System.out.println("value of p : " + p);

        // value of this keyword : Point@251a69d7
        // value of p :            Point@251a69d7
    }

}
