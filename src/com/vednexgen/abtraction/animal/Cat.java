package com.vednexgen.abtraction.animal;

public class Cat implements Animal, Action {

    @Override
    public void sound() {
        System.out.println("Cat meows.....");
    }

    @Override
    public void toEat() {
        System.out.println("Cat is eating....");
    }

    public void bite() {
        System.out.println("Bite.....");
    }

    @Override
    public void run() {

    }
}
