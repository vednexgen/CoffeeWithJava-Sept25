package com.vednexgen.packtwo;

import com.vednexgen.packone.Bank;

public class SubBank {

    public static void main(String[] args) {
        Bank bank = new Bank();


        // cannot access balance, since it is default and we are trying to access it in different package
//        System.out.println(bank.balance);

        // cannot access holderName, since it is protected and do not have parent-child relation between SubBank and bank classes.
//        System.out.println(bank.holderName);

        System.out.println(bank.accountNumber);

        // cannot access accType, since it is private
//        System.out.println(bank.accType);
    }
}
