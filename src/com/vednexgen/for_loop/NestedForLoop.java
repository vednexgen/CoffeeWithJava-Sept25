package com.vednexgen.for_loop;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int i = 8; i == 8; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println(); // new line after inner loop
        }
    }
}