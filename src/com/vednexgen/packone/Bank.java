package com.vednexgen.packone;

public class Bank{

    public int accountNumber; // access from anywhere
    protected String holderName; // within class, same package and sub-class
    int balance; // within same class or within same package
    private String accType;  // access within same class

    public static int accountCount;

    public Bank() {
        this.accType = "Saving";
        this.balance = 12345678;
        this.holderName = "Ved-NexGen";
        this.accountNumber = 12345;
//        System.out.println("Executing constructor");
    }

    static {
//        System.out.println("Executing static block");
        accountCount = 10;
    }

    void myAccountDetails() {
        System.out.println(this.accountNumber + " " + this.holderName + " " + this.balance + " " + this.accType);
    }

    public static void printBankName() {
        System.out.println("Bank name is NexGen Bank!!");
    }

    public static double convertToDollar(double inrValue) {
        double dollarValue = inrValue / 90;
        return dollarValue;
    }

    public double getDollarValue() {
        double dollarValue = this.balance / 90;
        return dollarValue;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.myAccountDetails();
    }

}
