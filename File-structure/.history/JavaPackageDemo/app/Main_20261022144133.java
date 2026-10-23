package app;

import calculator.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result = calc.add(10, 20);

        System.out.println("Addition: " + result);
    }
}

/*
 * javac -d out calculator/Calculator.java app/Main.java
 * java -cp out app.Main
 * 
 * -d out
 * Compile करताना .class files कुठे ठेवायच्या ते सांगतो.
 * 
 * 
 * -cp out
 * Program run करताना .class files कुठे शोधायच्या ते सांगतो.
 */