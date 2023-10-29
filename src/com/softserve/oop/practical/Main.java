package com.softserve.oop.practical;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sam", 130, 150);
        Employee employee2 = new Employee("Bob", 200, 125);
        Employee employee3 = new Employee("Mary", 350);
        employee3.setHours(80);

        System.out.println("Employees: ");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.printf("\nEmployees total salary: %.2f\n",Employee.getTotalSalary());
    }
}
