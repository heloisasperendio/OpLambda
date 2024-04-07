package org.example;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company() {
    }

    public Company(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }
    @Override
    public double tax() {
        if (numberOfEmployees < 10) {
            return getAnualIncome() * 0.16;
        } else {
            return getAnualIncome() * 0.14;
        }
    }
    @Override
    public String toString() {
        return getName() + ": $ " + tax();
    }
}
