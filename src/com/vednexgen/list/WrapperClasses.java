package com.vednexgen.list;

import com.vednexgen.domain.Person;

import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();

        list.add(10); // boxing

        Integer i = list.get(0);  // unboxing



    }
}
