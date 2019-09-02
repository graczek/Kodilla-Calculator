package com.kodilla;

public class Calculator {

    private int x;
    private int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Calculator() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double add(int x, int y) {
        return x + y;
    }

    public double substract(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.add(5, 6);
        System.out.println(result);
    }






}
