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
 *  javac -d out calculator/Calculator.java app/Main.java
 *  java -cp outapp.Main
 */