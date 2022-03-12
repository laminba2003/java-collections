package com.training.collections.list;

import java.util.Stack;
import java.util.stream.Collectors;

public class StackCollection {

    /**
     * The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack.
     * The stack contains all of the methods of Vector class and also provides its methods like boolean push(),
     * boolean peek(), boolean push(object o), which defines its properties
    **/
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("John Doe");
        names.push("Mansour Ndiaye");
        names.push("John Fall");
        System.out.println("head : " + names.peek());
        names.pop();
        System.out.println("Printing all names");
        names.forEach(System.out::println);
        System.out.println("Printing names with contains John");
        names.stream().filter(name -> name.contains("John")).collect(Collectors.toList()).forEach(name -> System.out.println(name));
    }
}
