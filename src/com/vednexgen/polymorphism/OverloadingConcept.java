package com.vednexgen.polymorphism;

import com.vednexgen.abtraction.animal.Cat;

public class OverloadingConcept {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,3));
        System.out.println(calculator.add(2,3, 4));
        System.out.println(calculator.add(2.2,3.2));
        System.out.println(calculator.add(2.2,3.2, 5.2));
        System.out.println(calculator.add(2,3.2));
        System.out.println(calculator.add(2.2,3));
    }

}

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    // Cannot overload only by changing return type.
//    public int add(int a, double b) {
//        return (int) (a + b);
//    }

    public double add(double a, int b) {
        return a + b;
    }

}