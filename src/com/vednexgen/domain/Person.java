package com.vednexgen.domain;

public record Person(String name, int age, long mobile) {

    void print() {
        System.out.println("Name : " + name);
    }

}
