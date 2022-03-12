package com.training.collections.list;

import java.util.Vector;
import java.util.stream.Collectors;

public class VectorCollection {

    /**
     * Vector uses a dynamic array to store the data elements. It is similar to ArrayList.
     * However, It is synchronized and contains many methods that are not the part of Collection framework.
    **/
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("John Doe");
        names.add("Mansour Ndiaye");
        names.add("John Fall");
        System.out.println("Printing all names");
        names.forEach(System.out::println);
        System.out.println("Printing names with contains John");
        names.stream().filter(name -> name.contains("John")).collect(Collectors.toList()).forEach(name -> System.out.println(name));
    }
}
