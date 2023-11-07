package com.softserve.BasicsOfOOP.Practical;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(200, 80, "Ivan");
        Employee emp2 = new Employee(300, 180, "Ivan");
        Employee emp3 = new Employee(100, 60, "Ivan");

        System.out.println(Employee.totalSalary);
    }
}
