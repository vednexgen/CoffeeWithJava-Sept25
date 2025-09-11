package com.vednexgen.packtwo;

import com.vednexgen.packone.Bank;

public class ChildBank extends Bank {

    public ChildBank() {
        super();
    }

    public static void main(String[] args) {
        ChildBank cb = new ChildBank();

        // cannot access balance, since it is default and we are trying to access it in different package
//        System.out.println(cb.balance);

        System.out.println(cb.holderName);
        System.out.println(cb.accountNumber);

        // cannot access accType, since it is private
//        System.out.println(cb.accType);
    }
}
