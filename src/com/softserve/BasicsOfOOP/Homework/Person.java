package com.softserve.BasicsOfOOP.Homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private static final Scanner SCANNER = new Scanner(System.in);
    private String name;
    private LocalDate dob;

    public Person() {
    }

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setDob(int year, int month, int day) {
        this.dob = LocalDate.of(year, month, day);
    }

    public int age() {
        return LocalDate.now().getYear() - this.dob.getYear();
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", dob=" + dob + '}';
    }
}
