package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return Calculator.sum(d) + multiply(d) + Calculator.minus(d) + divide(d);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = sum(5);
        int mult = calculator.multiply(5);
        int min = minus(5);
        int div = calculator.divide(5);
        System.out.println(sum);
        System.out.println(mult);
        System.out.println(min);
        System.out.println(div);
        int all = calculator.sumAllOperation(10);
        System.out.println(all);
    }
}
