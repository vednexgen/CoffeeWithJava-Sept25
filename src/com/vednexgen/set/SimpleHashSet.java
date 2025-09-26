package com.vednexgen.set;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SimpleHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple"); // 0
        set.add("Banana"); // 1
        set.add("Mango"); // 2
        set.add("Apple"); // 3, duplicate, will be ignored

        // Printing elements
        System.out.println("HashSet: " + set);

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.addAll(set);
        System.out.println("sortedSet: " + sortedSet);


        // Check if element exists
        System.out.println("Contains Mango? " + set.contains("Mango"));

        // Remove element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // Iterating through HashSet
        for (String fruit : set) {
            System.out.println(fruit);
        }

        set.forEach(setElement -> IO.println(setElement));

    }
}