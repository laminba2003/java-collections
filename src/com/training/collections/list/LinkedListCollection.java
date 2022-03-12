package com.training.collections.list;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class LinkedListCollection {

    /**
     * LinkedList implements the Collection interface.
     * It uses a doubly linked list internally to store the elements.
     * It can store the duplicate elements. It maintains the insertion order and is not synchronized.
     * In LinkedList, the manipulation is fast because no shifting is required.
     **/
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("John Doe");
        names.add("Mansour Ndiaye");
        names.add("John Fall");
        System.out.println("Printing all names");
        names.forEach(System.out::println);
        System.out.println("Printing names with contains John");
        names.stream().filter(name -> name.contains("John")).collect(Collectors.toList()).forEach(name -> System.out.println(name));
    }
}
