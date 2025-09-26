package com.vednexgen.list;

import com.vednexgen.animal.Dog;
import com.vednexgen.domain.Car;
import com.vednexgen.domain.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentMap;

public class ArrayListSample {

    private  final int integer = 10;

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        IO.println(fruits.isEmpty());
        IO.println(fruits.size());

        fruits.add("Banana");  //  0
        fruits.add("Apple");  // 1
        fruits.add(null); // 2
        fruits.add(null);  // 3
        fruits.add("Apple");  // 5
//        fruits.add(10);

        IO.println("contains " + fruits.contains("Apple"));

        IO.println(fruits.isEmpty());
        IO.println(fruits.size());

        IO.println(fruits);

        fruits.remove(1);

        IO.println(fruits);
        IO.println(fruits.get(1));

        IO.println(fruits.size());

        String str = "";

        str.length();

        ArrayList list = new ArrayList();

        list.add(new Dog());
        list.add(new Car());

        IO.println(list);

//        Dog dog = (Dog) list.get(0);

        for (Object obj : list) {
            if(obj instanceof Dog) {
                Dog dog = (Dog) obj;
            } else if (obj instanceof Car) {
                Car car = (Car) obj;
            }
        }

    }
}
