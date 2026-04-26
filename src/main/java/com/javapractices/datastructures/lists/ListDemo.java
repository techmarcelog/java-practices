package com.javapractices.datastructures.lists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> topics = new ArrayList<>();
        topics.add("Pointers");
        topics.add("Lists");
        topics.add("Linked Lists");

        for (String topic : topics) {
            System.out.println(topic);
        }
    }
}
