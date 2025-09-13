package com.vednexgen.abtraction.vehicle;

public abstract class Vehicle {

    abstract void start();

    public void insertFuel() {
        System.out.println("Adding Fuel to Vehicle...");
    }
}
