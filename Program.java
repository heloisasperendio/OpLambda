package org.example;


import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        Account acc1 = new SavingsAccount(1001, "Alex", 500.0, 0.01);
        list.add(acc1);
        Account acc2 = new BusinessAccount(1002, "Maria", 1000.0, 400.0);
        list.add(acc2);
        Account acc3 = new SavingsAccount(1003, "Bob", 300.0, 0.01);
        list.add(acc3);
        Account acc4 = new BusinessAccount(1005, "Ana", 500.0, 500.0);
        list.add(acc4);

        double sum = 0;
        for (Account acc : list){
            sum = sum + acc.getBalance();
        }
        System.out.println("Total Balance: " + sum);

        for (Account ac : list){
            ac.deposit(10.0);
        }
        for (Account ac : list){
            System.out.println("Updated balance for account " + ac.getNumber()+ ": "+ ac.getBalance());
        }
    }
}