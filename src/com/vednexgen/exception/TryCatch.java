package com.vednexgen.exception;

public class TryCatch {
    public static void main(String[] args) {
        try {
             int result = 10 / 0; // risky code
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

//        int result = 10 / 0;

    }
}