package main.java.com;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:o");
        double primeiroNum = scanner.nextDouble();

        System.out.println("Digite o segundo numero:");
        double segundoNum = scanner.nextDouble();

        System.out.println("Digite o terceiro numero:");
        double terceiroNum = scanner.nextDouble();
        double soma = (primeiroNum+segundoNum+terceiroNum);
        double area = (soma/3);

        System.out.println("A media aritimetrica é:" +area);


    }
}
