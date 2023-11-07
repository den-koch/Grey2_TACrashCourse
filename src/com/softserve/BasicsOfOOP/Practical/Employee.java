package com.softserve.BasicsOfOOP.Practical;

import java.util.ArrayList;

public class Employee {
    private static final ArrayList<Employee> listOfEmp = new ArrayList<>();
    public static int totalSalary = 0;
    private int rate = 0;
    private int hours = 0;
    private String name;

    public Employee() {
        listOfEmp.add(this);
        totalSalary = calcTotalSalary();
    }

    public Employee(int rate, String name) {
        this.rate = rate;
        this.name = name;
        listOfEmp.add(this);
        totalSalary = calcTotalSalary();
    }

    public Employee(int rate, int hours, String name) {
        this.rate = rate;
        this.hours = hours;
        this.name = name;
        listOfEmp.add(this);
        totalSalary = calcTotalSalary();
    }

    private static int calcTotalSalary() {
        return listOfEmp.stream()
                .map(Employee::getSalary)
                .reduce(Integer::sum).orElse(0);
    }

    public int getSalary() {
        return this.hours * this.rate;
    }

    public double getBonus() {
        return this.getSalary() * 0.1;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "rate=" + rate +
               ", hours=" + hours +
               ", name='" + name + '\'' +
               '}';
    }
}
