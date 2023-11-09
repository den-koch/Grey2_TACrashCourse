package com.softserve.Collections.Homework.Task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Map<String, String> peopleMap = createPeopleMap();

        printPMap(peopleMap);
        System.out.println("\n");

        System.out.println(isDuplicatedFirstName(peopleMap)
                ? "There are duplicated first names" + "\n"
                : "There are not duplicated first names" + "\n");

        removePersonsWithFirstName(peopleMap, "Ivan");

        printPMap(peopleMap);

    }

    public static void printPMap(Map<String, String> pMap) {
        pMap.forEach((lastName, firstName) -> System.out.printf("%s - %s%n", lastName, firstName));
    }

    public static boolean isDuplicatedFirstName(Map<String, String> pMap) {
        return pMap.values().stream().distinct().count() != pMap.size();
    }

    public static void removePersonsWithFirstName(Map<String, String> pMap, String firstName) {
        pMap.entrySet().removeIf(entry -> firstName.equals(entry.getValue()));
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> peopleMap = new HashMap<>();
        peopleMap.put("Holotsvan", "Ivan");
        peopleMap.put("Doe", "Jhon");
        peopleMap.put("Smith", "Jhonson");
        peopleMap.put("Swift", "Taylor");
        peopleMap.put("Great", "Davidos");
        peopleMap.put("Mazepa", "Ivanna");
        peopleMap.put("Jones", "Mary");
        peopleMap.put("Don", "Jhonenko");
        peopleMap.put("Williams", "David");
        peopleMap.put("Fisher", "Alex");
        return peopleMap;

    }
}
