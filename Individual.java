package org.example;

public class Individual extends TaxPayer {

    private double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnualIncome() < 20000.0) {
            return getAnualIncome() * 0.15 - (healthExpenditures * 0.5);
        } else {
            return getAnualIncome() * 0.25 - (healthExpenditures * 0.5);
        }
    }

    @Override
    public String toString() {
        return getName() + ": $ " + tax();
    }
}

