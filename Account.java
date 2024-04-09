package org.example;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdawLimit;

    public Account(Integer number, String holder,Double balance, Double withdawLimit) throws DomainException{
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdawLimit = withdawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdawLimit() {
        return withdawLimit;
    }

    public void setWithdawLimit(Double withdawLimit) {
        this.withdawLimit = withdawLimit;
    }
    public void withdraw(double amount) throws DomainException {
        validateWithdraw (amount);
        balance -= amount;
    }
        public void validateWithdraw (double amount) throws DomainException {

            if (amount > getBalance()) {
                throw new DomainException("Not enough balance");
            }
            if (amount > getWithdawLimit()) {
                throw new DomainException("The amount exceeds withdraw limit");
            }
    }
}
