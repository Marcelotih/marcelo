package main.java.com;

import java.util.Scanner;

public class Divisaoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro Numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo Numero: ");
        double segundoNumero = scanner.nextDouble();
        if (segundoNumero <= 0) {
            System.out.println("Impossivel seu idiota ");
        } else {
            System.out.println("O resultado da divisão é: ");
            System.out.println(primeiroNumero / segundoNumero);}


        }
    }
