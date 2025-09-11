package com.vednexgen.domain;

public class Car {

    private String name;
    private String model;
    private String color;

    public Car() {
        this.name = "Maruti";
        this.model = "Desire";
        this.color = "Black";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
