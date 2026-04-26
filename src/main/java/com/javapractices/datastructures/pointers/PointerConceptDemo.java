package com.javapractices.datastructures.pointers;

public class PointerConceptDemo {
    public static void main(String[] args) {
        String a = "StackEx";
        String b = a; // b referencia o mesmo objeto

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Mesmo objeto? " + (a == b));
    }
}
