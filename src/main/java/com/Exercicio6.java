package main.java.com;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a conta: ");
        double conta = scanner.nextDouble();

        System.out.println("Numero de pessoas: ");
        double pessoas = scanner.nextDouble();
        double valorIndividual = (conta/pessoas);

        System.out.println("A conta foi de: "+valorIndividual);
    }
}
