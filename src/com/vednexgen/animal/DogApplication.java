package com.vednexgen.animal;

public class DogApplication {

    public static void main(String[] args) {
        Dog dog = new Dog();

//        dog.breed = "Dog Breed";
        dog.setBreed("Labro Dog");

        System.out.println(dog.getBreed());
    }
}
