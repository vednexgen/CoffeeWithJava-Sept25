package com.vednexgen;

public class LongSample {

    public static void main(String[] args) {
        long value = 123424;

        someMethod(value);
    }

    private static void someMethod(Long value) {
        System.out.println(value);

        System.out.println(value.longValue());

        System.out.println(value.toString());
    }
}
