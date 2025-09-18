package com.vednexgen.if_else;

public class IfElseStatement {
    public static void main(String[] args) {
        verifyNumber(0);
    }

    private static void verifyNumber(int number) {

        if (number >= 0) {
            System.out.println("The number is non-negative");
        } else {
            System.out.println("The number is negative");
        }
    }
}