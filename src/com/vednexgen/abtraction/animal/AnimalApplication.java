package com.vednexgen.abtraction.animal;

public class AnimalApplication {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
//        dog.getLegsCount();
        System.out.println(Animal.GROUP);
        System.out.println(Animal.getGroupName());

        Animal cat = new Cat();
        cat.sound();
//        cat.bite();

//        Animal dog1 = new Animal();
    }
}
