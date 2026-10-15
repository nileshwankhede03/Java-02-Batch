
class Nilesh {
    private String mobile = "Iphone";
}

public class Access {
    public static void main(String[] args) {
        Nilesh obj = new Nilesh();
        System.out.println(obj.mobile);

        final float PI = 3.14f;
        PI

    }
}

// Access.java:9: error: mobile has private access in Nilesh
// System.out.println(obj.mobile);
// ^
// 1 error