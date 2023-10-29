package com.softserve.oop.practical;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private double salary;

    private static double totalSalary;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;

        setSalary();
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(){
        salary = hours * rate;
        totalSalary += salary;
    }

    public double getBonuses() {
        return salary * 0.1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        totalSalary -= salary;
        this.rate = rate;
        setSalary();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSalary -= salary;
        this.hours = hours;
        setSalary();
    }

    public static double getTotalSalary(){
        return totalSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
