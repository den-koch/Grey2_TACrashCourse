package com.softserve.oop.homework;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birth;

    public Person() {
    }

    public Person(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public int age() {
        LocalDate now = LocalDate.now();
        return Period.between(birth, now).getYears();
    }

    public void input(){
        this.name = Input.name();
        this.birth = Input.date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(int year, int month, int day) {
        this.birth = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return "Person {" +
                "name = '" + name + '\'' +
                ", birth = " + birth +
                '}';
    }
}
