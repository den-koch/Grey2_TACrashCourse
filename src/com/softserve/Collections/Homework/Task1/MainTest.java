package com.softserve.Collections.Homework.Task1;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static com.softserve.Collections.Homework.Task1.Main.intersect;
import static com.softserve.Collections.Homework.Task1.Main.union;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testUnionWithEmptySets() {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> result = union(set1, set2);

        Set<Integer> expected = new HashSet<>();

        assertEquals("Union of two empty sets should be an empty set", expected, result);
    }

    @Test
    public void testUnionIntegerSets() {
        Set<Integer> set1 = Set.of(1, 2, 3, 4);
        Set<Integer> set2 = Set.of(3, 4, 5, 6);

        Set<Integer> result = union(set1, set2);

        Set<Integer> expected = Set.of(1, 2, 3, 4, 5, 6);

        assertEquals("Union of integer sets should have all unique integers", expected, result);
    }


    @Test
    public void testUnionDoubleSets() {
        Set<Double> set1 = Set.of(1.5, 2.0, 3.5);
        Set<Double> set2 = Set.of(3.0, 4.5, 5.0);

        Set<Double> result = union(set1, set2);

        Set<Double> expected = Set.of(1.5, 2.0, 3.5, 3.0, 4.5, 5.0);

        assertEquals("Union of double sets should have all unique double values", expected, result);
    }

    @Test
    public void testUnionCharSets() {
        Set<Character> set1 = Set.of('a', 'b', 'c');
        Set<Character> set2 = Set.of('c', 'd', 'e', 'a');

        Set<Character> result = union(set1, set2);

        Set<Character> expected = Set.of('a', 'b', 'c', 'd', 'e');

        assertEquals("Union of character sets should have all unique characters", expected, result);
    }

    @Test
    public void testUnionStringSets() {
        Set<String> set1 = Set.of("apple", "banana", "cherry", "grape");
        Set<String> set2 = Set.of("cherry", "banana", "date", "fig", "grape");

        Set<String> result = union(set1, set2);

        Set<String> expected = Set.of("apple", "banana", "cherry", "date", "fig", "grape");

        assertEquals("Union of string sets should have all unique strings", expected, result);
    }

    @Test
    public void testUnionMixedDataTypes() {
        Set<Object> set1 = Set.of(1, 2.0, 'a', 'b');
        Set<Object> set2 = Set.of('b', "apple", 2.0);

        Set<Object> result = union(set1, set2);

        Set<Object> expected = Set.of(1, 2.0, 'a', 'b', "apple");

        assertEquals("Union of sets with mixed data types should preserve data types", expected, result);
    }

    @Test
    public void testUnionEmpSets() {
        Set<Employee> set1 = Set.of(
                new Employee(2, "Bob"),
                new Employee(4, "Dave"),
                new Employee(5, "Eve")
        );
        Set<Employee> set2 = Set.of(
                new Employee(1, "Bob"),
                new Employee(4, "Dave"),
                new Employee(5, "Eve"),
                new Employee(6, "Mark")
        );
        Set<Employee> result = union(set1, set2);
        Set<Employee> expected = Set.of(
                new Employee(2, "Bob"),
                new Employee(4, "Dave"),
                new Employee(5, "Eve"),
                new Employee(1, "Bob"),
                new Employee(6, "Mark")
        );

        assertEquals("Union of sets with mixed data types should have all unique employees", expected, result);
    }

    @Test
    public void testIntersectWithEmptySets() {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> result = intersect(set1, set2);

        Set<Integer> expected = new HashSet<>();

        assertEquals("Intersect of two empty sets should be an empty set", expected, result);
    }

    @Test
    public void testIntersectCommonElements() {
        Set<Integer> set1 = Set.of(1, 2, 3, 4);
        Set<Integer> set2 = Set.of(3, 4, 5, 6);

        Set<Integer> result = intersect(set1, set2);

        Set<Integer> expected = Set.of(3, 4);

        assertEquals("Intersection of sets with common elements should have common elements", expected, result);
    }

    @Test
    public void testIntersectNoCommonElements() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(4, 5, 6);

        Set<Integer> result = intersect(set1, set2);
        Set<Integer> expected = Set.of();

        assertEquals("Intersection of sets with no common elements should be an empty set", expected, result);
    }
}