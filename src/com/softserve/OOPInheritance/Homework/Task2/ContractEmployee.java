package com.softserve.OOPInheritance.Homework.Task2;

public class ContractEmployee extends Employee implements Payable {
    String federalTaxNumber;
    private int hourlyRate;
    private int workedHours;

    public ContractEmployee(String id, String firstName, String lastName, String federalTaxNumber, int hourlyRate, int workedHours) {
        super(id, firstName, lastName);
        this.federalTaxNumber = federalTaxNumber;
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public String getFederalTaxNumber() {
        return federalTaxNumber;
    }

    public void setFederalTaxNumber(String federalTaxNumber) {
        this.federalTaxNumber = federalTaxNumber;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * workedHours;
    }

}
