package com.vednexgen.abtraction.animal;

public interface Animal {

    String GROUP = new String("mamals"); // by default it will public status and final

    public void sound();

    public default void toEat() {
        System.out.println("Animal is eating....");
    }

    public static String getGroupName() {
        return GROUP;
    }

    private void thingsToEat() {
        System.out.println("Animal is eating....");
    }


    // Interface abstract methods cannot have a body
//    public void walk() {
//
//    };
}
