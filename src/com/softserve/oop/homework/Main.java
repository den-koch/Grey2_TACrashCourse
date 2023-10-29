package com.softserve.oop.homework;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Bob");
        person1.setBirth(1995, 8, 29);

        System.out.println(person1);
        System.out.printf("%s's age = %d\n", person1.getName(), person1.age());

        Person person2 = new Person();
        person2.input();

        System.out.println(person1);

    }
}
