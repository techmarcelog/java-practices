package com.javapractices.datastructures.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> frequencies = new HashMap<>();
        frequencies.put("stack", 2);
        frequencies.put("queue", 1);
        frequencies.put("map", 3);

        System.out.println(frequencies);
    }
}
