package com.training.collections.queue;

import java.util.ArrayDeque;

public class ArrayDequeCollection {

    /**
     * ArrayDeque class implements the Deque interface. It facilitates us to use the Deque.
     * Unlike queue, we can add or delete the elements from both the ends.
     * ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
     *
    **/
    public static void main(String[] args) {
        ArrayDeque<String> names = new ArrayDeque<>();
        names.add("John Doe");
        names.addLast("Mansour Ndiaye");
        names.addFirst("John Fall");
        System.out.println("head : " + names.peek());
        System.out.println("Printing all names");
        names.forEach(System.out::println);
        names.poll();
        System.out.println("Printing all names");
        names.forEach(System.out::println);
    }
}
