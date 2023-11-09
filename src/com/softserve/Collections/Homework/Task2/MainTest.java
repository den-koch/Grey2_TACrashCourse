package com.softserve.Collections.Homework.Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.softserve.Collections.Homework.Task2.Main.isDuplicatedFirstName;
import static com.softserve.Collections.Homework.Task2.Main.removePersonsWithFirstName;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    @Test
    public void testIsDuplicatedFirstNameWithDuplicates() {
        Map<String, String> pMap = new HashMap<>();
        pMap.put("Holotsvan", "Ivan");
        pMap.put("Doe", "Jhon");
        pMap.put("Mazepa", "Ivan");
        pMap.put("Shakespeare", "William");

        boolean result = isDuplicatedFirstName(pMap);

        assertTrue(result, "There are duplicated first names, so the result should be true.");
    }

    @Test
    public void testIsDuplicatedFirstNameWithoutDuplicates() {
        Map<String, String> pMap = new HashMap<>();
        pMap.put("Tkach", "Stas");
        pMap.put("Doe", "Jhon");
        pMap.put("Ivan", "Holotsvan");

        boolean result = isDuplicatedFirstName(pMap);

        assertFalse(result, "There are no duplicated first names, so the result should be false.");
    }

    @Test
    public void testIsDuplicatedFirstNameWithEmptyMap() {
        Map<String, String> pMap = new HashMap<>();

        boolean result = isDuplicatedFirstName(pMap);

        assertFalse(result, "The map is empty, so there are no duplicated first names, and the result should be false.");
    }

    @Test
    public void testRemovePersonsWithFirstName() {
        Map<String, String> pMap = new HashMap<>();
        pMap.put("Ivanenko", "Ivan");
        pMap.put("Petrenko", "Olena");
        pMap.put("Kovalenko", "Olena");
        pMap.put("Sydorenko", "Ivan");

        removePersonsWithFirstName(pMap, "Olena");

        assertFalse(pMap.containsValue("Olena"), "Entries with first name 'Olena' should be removed.");
    }

    @Test
    public void testRemovePersonsWithFirstNameNoMatch() {
        Map<String, String> pMap = new HashMap<>();
        pMap.put("Ivanov", "Petro");
        pMap.put("Petrov", "Oksana");
        pMap.put("Koval", "Vasyl");
        pMap.put("Sydorov", "Mariya");
        
        int expectedSize = pMap.size();

        removePersonsWithFirstName(pMap, "Yuriy");
        int resultedSize = pMap.size();
        Assertions.assertEquals(expectedSize, resultedSize, "Hash map shouldn't be edited.");
    }
}