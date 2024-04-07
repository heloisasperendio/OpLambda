package org.example;

import java.sql.SQLOutput;
import java. util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++){
            System.out.println("Payer #" + i + " data: ");
            System.out.print("Individual or Company (i/c)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'i'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                TaxPayer tax = new Individual(name, anualIncome, healthExpenditures);
                list.add(tax);
            }
            else {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                TaxPayer tax = new Company(name, anualIncome, numberOfEmployees);
                list.add(tax);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID ");
        for (TaxPayer tax : list ) {
            System.out.println(tax);
        }

    }
}