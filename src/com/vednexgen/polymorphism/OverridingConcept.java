package com.vednexgen.polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class OverridingConcept {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // Upcasting
        Animal a2 = new Cat();
        Animal animal = new Animal();

        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
        animal.sound();

        Dog dog = new Dog();
        dog.sound();
    }
}