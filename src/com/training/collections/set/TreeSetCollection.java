package com.training.collections.set;

import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetCollection {

    /**
     * LinkedHashSet class represents the LinkedList implementation of Set Interface.
     * It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements.
     * It maintains the insertion order and permits null elements
    **/
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("John Doe");
        names.add("Mansour Ndiaye");
        names.add("John Fall");
        names.add("John Fall");
        System.out.println("Printing all names");
        names.forEach(System.out::println);
        System.out.println("Printing names with contains John");
        names.stream().filter(name -> name.contains("John")).collect(Collectors.toList()).forEach(name -> System.out.println(name));
    }
}
