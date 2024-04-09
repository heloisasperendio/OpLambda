package org.example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) throws DomainException {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account (number, holder, balance, withdrawLimit);


        System.out.println();
        System.out.println("Enter amount for withdraw: ");
        double amount = sc.nextDouble();


        try {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        }

        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
        sc.close();
    }
}