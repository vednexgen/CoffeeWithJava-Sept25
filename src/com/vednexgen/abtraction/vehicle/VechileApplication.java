package com.vednexgen.abtraction.vehicle;

public class VechileApplication {

    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.start();
        bike.insertFuel();

        Vehicle car = new Car();
        car.start();
        car.insertFuel();

//        Vehicle vehicle = new Vehicle();
    }
}
