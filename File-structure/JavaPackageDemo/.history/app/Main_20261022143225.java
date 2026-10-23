package app;

import calculator.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result = calc.add(10, 20);

        System.out.println("Addition: " + result);
    }
}
