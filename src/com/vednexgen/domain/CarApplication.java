package com.vednexgen.domain;

public class CarApplication {

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.getName());

        car.setName("i20");

        System.out.println(car.getName());
    }

}
