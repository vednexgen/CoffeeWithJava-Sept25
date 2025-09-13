package com.vednexgen.abtraction.animal;

public interface Animal {

    public void sound();

    public default void toEat() {
        System.out.println("Animal is eating....");
    }

    // Interface abstract methods cannot have a body
//    public void walk() {
//
//    };
}
