package com.vednexgen.exception;

import java.io.File;

public class FinallyDemo {


    public static void main(String[] args) {

//        try {
//            int arr[] = new int[3];
//            arr[2] = 10; // not risky code
//            System.out.println("Code executed successfully");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array index error: " + e);
//        } finally {
//            System.out.println("Finally block executed.");
//        }


        try {
            int arr[] = {1,2,3};
            System.out.println(arr[5]);
            int result = arr[1]/0;
            System.out.println("Code executed successfully");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }

        IO.println("-------------------------------------");

        try {
            extracted();
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Handle error");
        }
    }

    private static void extracted() throws IndexOutOfBoundsException, ArithmeticException {
        try{

            // m1()
//            m2()
//            m3()

            int arr[] = {1,2,3};
            System.out.println(arr[2]);
            int result = arr[1]/0;
            System.out.println("Code executed successfully");

        } catch (IndexOutOfBoundsException | ArithmeticException  e) {
            System.out.println("Exception occures: " + e);
            throw e;
        } catch (Exception e) {
            System.out.println("Exception occures: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}