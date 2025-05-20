package main.java.com;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a temperatura: ");
        double c = scanner.nextDouble();
        double f = (c*9/5+32);

        System.out.println("A temperatura foi convertida para: " +f+" Fahrenheit");
    }
}
