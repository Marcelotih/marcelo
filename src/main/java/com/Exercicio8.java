package main.java.com;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a km da distancia: ");
        double km1 = scanner.nextDouble();
        System.out.println("Digite a km da distancia: ");
        double km2 = scanner.nextDouble();
        double soma = (km1+km2);
        double diferenca = (km1-km2); //pode ser negativo

        System.out.println("A soma e a diferença foram: ");
        System.out.println(soma);
        System.out.println(diferenca);


    }
}
