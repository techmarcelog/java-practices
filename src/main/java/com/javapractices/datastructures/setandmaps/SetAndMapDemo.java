package com.javapractices.datastructures.setandmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetAndMapDemo {
    public static void main(String[] args) {
        Set<String> uniqueTopics = new HashSet<>();
        uniqueTopics.add("stack");
        uniqueTopics.add("stack");
        uniqueTopics.add("queue");

        Map<String, String> descriptions = new HashMap<>();
        descriptions.put("stack", "LIFO");
        descriptions.put("queue", "FIFO");

        System.out.println(uniqueTopics);
        System.out.println(descriptions);
    }
}
