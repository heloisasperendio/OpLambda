//238
package org.example;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual operacao deseja realizar? ");
        System.out.println("[1] - SOMA");
        System.out.println("[2] - SUBTRACÃO");
        System.out.println("[3] - MULTIPLICACÃO");
        System.out.println("[4] - DIVISÃO");
        System.out.println("[5] - SAIR");

        int n = sc.nextInt();

        Operacoes op = new Operacoes();

        while (n !=5){
            if(n == 1){

                System.out.println("Digite os números da operacão: ");
                double n1 = sc.nextDouble();
                double n2 = sc.nextDouble();
                op.setNumeros(n1,n2);
                System.out.println("Soma = " + op.soma());
            }
            else if(n == 2){

                System.out.println("Digite os números da operacão");
                double n1 = sc.nextDouble();
                double n2 = sc.nextDouble();
                op.setNumeros(n1,n2);
                System.out.println("Subtracão = " + op.subtracao());
            }
            else if(n == 3){

                System.out.println("Digite os números da operacão");
                double n1 = sc.nextDouble();
                double n2 = sc.nextDouble();
                op.setNumeros(n1,n2);
                System.out.println("Multiplicacão = " + op.multiplicacao());
            }
            else if (n == 4){

                System.out.println("Digite os números da operacão");
                double n1 = sc.nextDouble();
                double n2 = sc.nextDouble();
                op.setNumeros(n1,n2);
                System.out.println("Divisão = " + op.divisao());
            }
        }

        sc.close();
    }

}
