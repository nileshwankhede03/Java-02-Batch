
public class Point {
    int x, y; // Instance field (Instance == object variable)

    // Point(20, 30)
    Point(int value1, int value2) {
        System.out.println();
        this.x = value1;
        this.y = value2;
    }

    // this -> refers to current object

    public static void main(String[] args) {
        // obj creation
        Point p = new Point(20, 30);
    }

}
