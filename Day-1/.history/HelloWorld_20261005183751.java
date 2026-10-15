
class HelloWorld {
    public static void main(String[] rahim) {
        System.out.println("Hello World");
    }
}

/*
 * javap -c HelloWorld

 * Compiled from "HelloWorld.java"
 * class HelloWorld {
 * HelloWorld();
 * Code:
 * 0: aload_0
 * 1: invokespecial #1 // Method java/lang/Object."<init>":()V
 * 4: return
 * 
 * public static void main(java.lang.String[]);
 * Code:
 * 0: getstatic #7 // Field java/lang/System.out:Ljava/io/PrintStream;
 * 3: ldc #13 // String Hello World
 * 5: invokevirtual #15 // Method
 * java/io/PrintStream.println:(Ljava/lang/String;)V
 * 8: return
 * }
 */