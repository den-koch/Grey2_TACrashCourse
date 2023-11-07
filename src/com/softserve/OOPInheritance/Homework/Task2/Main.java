package com.softserve.OOPInheritance.Homework.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>(List.of(
                new ContractEmployee("ce0001", "Ivan", "Holotsvan", "981-35-5342", 20, 83),
                new SalariedEmployee("se0002", "Ann", "Cooper", "123-45-6789", 5000),
                new ContractEmployee("ce0003", "Misha", "Argan", "951-32-3311", 15, 61),
                new ContractEmployee("ce0002", "John", "Doe", "911-31-1487", 80, 16),
                new ContractEmployee("ce0005", "Ivan", "Holotsvan", "411-33-5341", 10, 33),
                new ContractEmployee("ce0004", "Ivan", "Holotsvan", "931-51-6142", 100, 13),
                new SalariedEmployee("se0004", "Sandy", "Cheek", "123-45-6789", 1500),
                new SalariedEmployee("se0003", "Grigoriy", "Patron", "123-45-6789", 3000),
                new SalariedEmployee("se0001", "Bob", "Fisher", "123-45-6789", 2000)
        ));

        Collections.shuffle(emps);


        System.out.println("Sorted in descending by Id\n");
        emps.stream().sorted(Comparator.comparing(Employee::getId).reversed())
                .forEach(System.out::println);

        System.out.println("Sorted in descending by Salary:\n");
        emps.stream().sorted(Comparator.comparing(Payable::calculatePay).reversed())
                .forEach(System.out::println);

    }
}
