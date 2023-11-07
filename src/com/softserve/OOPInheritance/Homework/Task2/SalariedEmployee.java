package com.softserve.OOPInheritance.Homework.Task2;

public class SalariedEmployee extends Employee {
    private int salary;
    private String socialSecurityNumber;

    public SalariedEmployee(String id, String firstName, String lastName, String socialSecurityNumber, int salary) {
        super(id, firstName, lastName);
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    @Override
    public double calculatePay() {
        return salary;
    }
}
