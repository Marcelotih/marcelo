package main.java.com;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro Numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo Numero: ");
        double segundoNumero = scanner.nextDouble();
        double soma= primeiroNumero + segundoNumero;
      double media= soma /2;
        System.out.println("O resultado é: ");
        System.out.println(media);
    }
    }
