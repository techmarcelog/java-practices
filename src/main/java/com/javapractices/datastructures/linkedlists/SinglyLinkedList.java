package com.javapractices.datastructures.linkedlists;

public class SinglyLinkedList {
    private Node head;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public String print() {
        StringBuilder builder = new StringBuilder();
        Node current = head;

        while (current != null) {
            builder.append(current.value);
            if (current.next != null) {
                builder.append(" -> ");
            }
            current = current.next;
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.print());
    }
}
