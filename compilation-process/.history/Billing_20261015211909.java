
public class Billing {
    public static void main(String[] args) {
        String name = "Rohit";

        // statement : aapan java la action karayla lavto
        System.out.println("Hello " + name);

        // Expression
        // String name = "Rohit";

        // declaration
        // String name1;

        // void displayName();
        // class Demo {}

        // System.out.println(price);
        // int isActive = true;

    }
}

// 1. Lexer analysis
// String name = "Rohit";
// String - token

// Types of tokens
// keywords , operators & seperator , identifier , literal

// "String name = "Rohit"";
// String , name , = , "Rohit

// 2. Parser (Builds a syntax tree)
// String "Rohit" = name
// java tokens la java chya rules nusar thevte
// & tya token cha Tree like strcure banavate so tyalach
// Abstract syntax tree mhantat
// tyat branch(Node) statement , declaration & Expression

// Yat aapan all syntax errors identify krrto
// ex -> 1. ; missing , 2. { } opening/closing missing , 3. Expression java chya
// rule nusar nasane

// statement :
// expression :
// declaration :

// 3. Semantic Analyzer (checks types (DataType) & Symbols (identifier))

// checking points :
// 1. use kelela variable, method or class declared aahe ka?
// 2. local variable la value dilyanantr to use kela aahe ka ?
// 3. different datatype madhe related datatype chi value aahe ka?
