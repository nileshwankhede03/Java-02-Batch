import java.io.*;

class Error1 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("abc.txt");
        } catch (Exception e) {
           System.out.println(e.get);
        }
    }
}

// Compile-time exception (Semantic analysis)

// Error1.java:5: error: unreported exception FileNotFoundException; must be
// caught or declared to be thrown
// FileReader file = new FileReader("abc.txt");
// ^
// 1 error