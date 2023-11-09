package com.softserve.Collections.Homework.Task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Integer sets
        Set<Integer> setInt1 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> setInt2 = new HashSet<>(Set.of(2, 3, 5, 8, 9));
//      String sets
        Set<String> setStr1 = new HashSet<>(Set.of("apple", "banana", "kiwi", "dog", "cat"));
        Set<String> setStr2 = new HashSet<>(Set.of("apple", "eagle", "man", "kiwi", "dog"));
//      Emp sets
        Set<Employee> setEmp1 = new HashSet<>(Set.of(
                new Employee(2, "Bob"),
                new Employee(4, "Dave"),
                new Employee(5, "Eve")
        ));
        Set<Employee> setEmp2 = new HashSet<>(Set.of(
                new Employee(1, "Bob"),
                new Employee(4, "Dave"),
                new Employee(5, "Eve"),
                new Employee(6, "Mark")
        ));

        System.out.format("Union set: %s%n", union(setInt1, setInt2));
        System.out.format("Intersect set: %s%n", intersect(setInt1, setInt2));

        System.out.format("Union set: %s%n", union(setStr1, setStr2));
        System.out.format("Intersect set: %s%n", intersect(setStr1, setStr2));

        System.out.format("Union set: %s%n", union(setEmp1, setEmp2));
        System.out.format("Intersect set: %s%n", intersect(setEmp1, setEmp2));
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectSet = new HashSet<>();
        for (T element : set1) {
            if (set2.contains(element)) {
                intersectSet.add(element);
            }
        }
        return intersectSet;
    }


}
