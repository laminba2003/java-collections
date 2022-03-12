package com.training.collections.set;

import java.util.HashSet;
import java.util.stream.Collectors;

public class HashSetCollection {

    /**
     * HashSet class implements Set Interface. It represents the collection that uses a hash table for storage.
     * Hashing is used to store the elements in the HashSet.
     * It contains unique items.
    **/
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
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
