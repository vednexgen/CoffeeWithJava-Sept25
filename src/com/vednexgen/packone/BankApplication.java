package com.vednexgen.packone;

public class BankApplication {

    public static void main(String[] args) {
//        Bank bank = new Bank();
//
//        System.out.println(bank.balance);
//        System.out.println(bank.holderName);
//        System.out.println(bank.accountNumber);

        // cannot access accType, since it is private
//        System.out.println(bank.accType);


//        Bank bank1 = new Bank();
//        Bank bank2 = new Bank();

        // accessing static variables
//        System.out.println(Bank.accountCount);

        // can not call non-static variable
//        System.out.println(Bank.holderName);

        // accessing static method
//        Bank.printBankName();


        System.out.println(Bank.convertToDollar(360));

        Bank bank = new Bank();
        System.out.println(bank.getDollarValue());

    }
}
