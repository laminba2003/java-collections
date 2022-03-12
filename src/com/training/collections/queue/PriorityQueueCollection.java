package com.training.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueCollection {

    /**
     * The PriorityQueue class implements the Queue interface which maintains the first-in-first-out order.
     * It holds the elements or objects which are to be processed by their priorities.
     * PriorityQueue doesn't allow null values to be stored in the queue.
    **/
    public static void main(String[] args) {
        PriorityQueue<String> names = new PriorityQueue<>();
        names.add("John Doe");
        names.add("Mansour Ndiaye");
        names.add("John Fall");
        System.out.println("head : " + names.peek());
        System.out.println("Printing all names");
        names.forEach(System.out::println);
        names.poll();
        System.out.println("Printing all names");
        names.forEach(System.out::println);
    }
}
