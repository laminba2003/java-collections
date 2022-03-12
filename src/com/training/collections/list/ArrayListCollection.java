package com.training.collections.list;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayListCollection {

    /**
     * The ArrayList class implements the List interface.
     * It uses a dynamic array to store the duplicate element of different data types.
     * The ArrayList class maintains the insertion order and is non-synchronized.
     * The elements stored in the ArrayList class can be randomly accessed.
    **/
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John Doe");
        names.add("Mansour Ndiaye");
        names.add("John Fall");
        System.out.println("Printing all names");
        names.forEach(System.out::println);
        System.out.println("Printing names with contains John");
        names.stream().filter(name -> name.contains("John")).collect(Collectors.toList()).forEach(name -> System.out.println(name));
    }
}
