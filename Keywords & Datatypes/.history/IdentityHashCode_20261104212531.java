
public class IdentityHashCode {
    public static void main(String[] args) {
        String firstName = "Nilesh";
        String middleName = "Bhau";
        String surName = "Wankhede";

        if (middleName != null) {
            System.out.println(firstName + " " + middleName + " " + surName);
        } else {
            System.out.println(firstName + " " + surName);
        }

    }
}
