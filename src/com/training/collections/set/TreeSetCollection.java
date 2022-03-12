package com.training.collections.set;

import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetCollection {

    /**
     * TreeSet class implements the Set interface that uses a tree for storage.
     * Like HashSet, TreeSet also contains unique elements. However, the access and retrieval time of TreeSet is quite fast.
     * The elements in TreeSet stored in ascending order.
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
