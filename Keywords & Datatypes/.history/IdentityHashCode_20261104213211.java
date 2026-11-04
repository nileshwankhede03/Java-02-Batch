
public class IdentityHashCode {

    // static method
    static void displayName(){
        System.out.println("Jay Ganesh...");
    }

    public static void main(String[] args) {
        // reference => address (Hashcode)

        
        // IdentityHashCode.displayName();

        String name = "Mayur";
        int referenceOfName = System.identityHashCode(name);
        System.out.println(referenceOfName);
    }
}