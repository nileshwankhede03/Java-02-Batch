public class GetActualReference {
    public static void main(String[] args) {
        String name1 = "Nilesh";
        String name2 = "Nilesh";

        int refOfName1 = System.identityHashCode(name1);

        System.out.println("ACTUAL REF (HASHCODE) of name1 variable : " + refOfName1); 
        int refOfName2 = System.identityHashCode(name2);
        System.out.println("ACTUAL REF (HASHCODE) of name1 variable : " + refOfName2);

    }
}
