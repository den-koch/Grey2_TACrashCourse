package com.softserve.Collections.Homework.Task1;

import java.util.HashSet;
import java.util.Objects;
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
        Set<Emp> setEmp1 = new HashSet<>(Set.of(
                new Emp(2, "Bob"),
                new Emp(4, "Dave"),
                new Emp(5, "Eve")
        ));
        Set<Emp> setEmp2 = new HashSet<>(Set.of(
                new Emp(1, "Bob"),
                new Emp(4, "Dave"),
                new Emp(5, "Eve"),
                new Emp(6, "Mark")
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

    static class Emp {
        private int id;
        private String name;

        public Emp(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Emp emp = (Emp) o;
            return id == emp.id && Objects.equals(name, emp.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return String.format("Emp{id=%d, name='%s'}", id, name);
        }

    }
}
