package com.softserve.Collections.Homework.Task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> pMap = new HashMap<>();
        pMap.put("Holotsvan", "Ivan");
        pMap.put("Doe", "Jhon");
        pMap.put("Smith", "Jhonson");
        pMap.put("Swift", "Taylor");
        pMap.put("Great", "Davidos");
        pMap.put("Mazepa", "Ivanna");
        pMap.put("Jones", "Mary");
        pMap.put("Don", "Jhonenko");
        pMap.put("Williams", "David");
        pMap.put("Fisher", "Alex");

        printPMap(pMap);
        System.out.println("\n");
        System.out.println(isDuplicatedFirstName(pMap)
                ? "There are duplicated first names"
                : "There are not duplicated first names");

        System.out.println("\n");

        removePersonsWithFirstName(pMap, "Ivan");
        printPMap(pMap);


    }

    public static void printPMap(Map<String, String> pMap) {
        pMap.forEach((lastName, firstName) -> System.out.printf("%s - %s%n", lastName, firstName));
    }

    public static boolean isDuplicatedFirstName(Map<String, String> pMap) {
        return pMap.values().stream().distinct().count() != pMap.values().stream().count();
    }

    public static void removePersonsWithFirstName(Map<String, String> pMap, String firstName) {
        pMap.entrySet().removeIf(entry -> firstName.equals(entry.getValue()));
    }
}
