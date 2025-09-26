package com.vednexgen.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapNull {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // Null key
        map.put(null, "Value1");
        map.put(null, "Value2"); // Replaces Value1

        // Null values
        map.put("A", null);
        map.put("a", null);

        System.out.println(map);

        HashMap<Integer, List<String>> map1 = new HashMap<>();

        List<String> values = new ArrayList<>();
        values.add("apple");
        values.add("banana");
        map1.put(1, values);

        IO.println(map1);
    }
}