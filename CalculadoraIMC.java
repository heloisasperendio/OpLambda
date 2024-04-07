package org.example;
import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao Calculo IMC da Helo s2 ");

        char resposta;

        do {
            System.out.print("Qual o seu peso? ");
            double peso = sc.nextDouble();
            System.out.print("E qual a sua altura? (em metros) ");
            double altura = sc.nextDouble();
            double imc = peso / (altura*altura);

            if (imc <= 18.4) {
                System.out.println("imc = " + imc + " - Voce está abaixo do peso");
                System.out.print("Deseja repetir (s/n)? ");
            }
            else if ( imc > 18.4 && imc <= 24.9) {
                System.out.println("imc = " + imc + " - Voce está no peso normal");
                System.out.print("Deseja repetir (s/n)? ");
            }
            else if (imc >= 25 && imc <= 29.9) {
                System.out.println("imc = " + imc + " - Voce está acima do peso");
                System.out.print("Deseja repetir (s/n)? ");
            }
            else if (imc >=30 && imc < 34.4) {
                System.out.println("imc = " + imc + " - Voce está com obesidade grau 1");
                System.out.print("Deseja repetir (s/n)? ");
            }
            else if (imc >= 35 && imc < 40) {
                System.out.println("imc = " + imc + " - Voce está com obesidade grau 2");
                System.out.print("Deseja repetir (s/n)? ");
            }
            else {
                System.out.println("imc = " + imc + " - Voce está com obesidade grau 3");
                System.out.print("Deseja repetir (s/n)? ");
            }
            resposta = sc.next().charAt(0);

        } while (resposta != 'n');

    }
}
