package main.java.com;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro Numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo Numero: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("O resultado é:  ");
        System.out.println(primeiroNumero + segundoNumero);
        System.out.println(primeiroNumero -segundoNumero);
        System.out.println(primeiroNumero *segundoNumero);
        System.out.println(primeiroNumero / segundoNumero);


    }
}
