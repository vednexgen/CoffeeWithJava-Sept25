package com.vednexgen.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CommonOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Check if contains
        System.out.println("List Size -->> " + numbers.size());

        // Check if contains
        System.out.println("Contains 20 ? -->> " + numbers.contains(20));

        System.out.println("Initial ArrayList numbers -->> " + numbers);

        // Replace element
        numbers.set(1, 25);

        System.out.println("Updated ArrayList numbers -->> " + numbers);

        for(Integer num : numbers) {
            num++;
            IO.println(num);
        }

        numbers.forEach(num -> IO.println(num));

        // Convert to LinkedList
        List<Integer> linkedNumbers = new LinkedList<>(numbers);
        System.out.println("LinkedList linkedNumbers -->> " + linkedNumbers);

    }
}