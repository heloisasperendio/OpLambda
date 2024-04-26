package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("Quantos estudantes para o curso A? ");
        int n = sc.nextInt();
        for (int i =0; i< n; i++){
            int codigo = sc.nextInt();
            set.add(codigo);
        }
        System.out.print("Quantos estudantes para o curso B?");
        int n1 = sc.nextInt();
        for (int i =0; i< n1; i++){
            int codigo = sc.nextInt();
            set.add(codigo);
        }
        System.out.print("Quantos estudantes para o curso C?");
        int n2 = sc.nextInt();
        for (int i =0; i< n2; i++){
            int codigo = sc.nextInt();
            set.add(codigo);
        }



        System.out.println("Total students: " + set.size());



    }
}