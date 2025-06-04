package main.java.com;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o peso");
        double peso = scanner.nextDouble();
        System.out.println("Digite a Altura");
        double altura = scanner.nextDouble();
        double imc = peso/(altura*altura);

        System.out.println("Seu imc está: "+imc);
    }
}
