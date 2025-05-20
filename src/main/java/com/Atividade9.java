package main.java.com;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B:");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de C:");
        double c = scanner.nextDouble();
        double bhaskara = (b*b-4*a*c)/(2*a);

        System.out.println("O resultado foi: " +bhaskara);
    }
}
