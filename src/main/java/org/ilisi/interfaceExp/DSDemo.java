package org.ilisi.interfaceExp;

interface Sortable {
    void sort();
}

class Stack implements Sortable {
    public void sort() {
        System.out.println("Sorting a stack.");
    }
}

class Queue implements Sortable {
    public void sort() {
        System.out.println("Sorting a queue.");
    }
}

class List implements Sortable {
    public void sort() {
        System.out.println("Sorting a list.");
    }
}

public class DSDemo {

    public static void main(String[] args) {
        Sortable stack = new Stack();
        Sortable queue = new Queue();
        Sortable list = new List();

        // Polymorphism in action
        stack.sort();
        queue.sort();
        list.sort();
    }



}
