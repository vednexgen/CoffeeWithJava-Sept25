package com.vednexgen.abtraction.animal;

public class Dog implements Animal {

    private int legsCount;

    public void sound(){
        System.out.println("Dog Barks.....");
    }

    public int getLegsCount() {
        System.out.println("In get legs count method....");
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }
}
