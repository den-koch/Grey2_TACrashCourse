package com.softserve.Collections.Practical.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, String> empMap = new HashMap<>();
        empMap.put(1, "Ivan");
        empMap.put(2, "Grisha");
        empMap.put(3, "Pasha");
        empMap.put(4, "Ann");
        empMap.put(5, "Dasha");
        empMap.put(6, "Alex");
        empMap.put(7, "John");
        empMap.put(8, "Alex");
        empMap.put(9, "John");
        empMap.put(10, "Alex");

        System.out.println(empMap);
        printUserById(empMap);
        printUsersWithName(empMap);

        SCANNER.nextDouble();


    }

    public static void printUserById(Map<Integer, String> map) {
        System.out.println("Please,enter id :");
        Integer id = SCANNER.nextInt();
        if (!map.containsKey(id)) {
            System.out.println("No such ID");
        } else {
            System.out.format("User with id %d is %s%n", id, map.get(id));
        }
    }

    public static void printUsersWithName(Map<Integer, String> map) {
        System.out.println("Please enter name");
        String name = SCANNER.next();
        if (!map.containsValue(name)) {
            System.out.println("Sorry no such name");
        } else {
            System.out.format("Users with name %s%n", name);
            map.entrySet()
                    .stream()
                    .filter(entry -> name.equals(entry.getValue()))
                    .forEach(System.out::println);
        }
    }
}
