package main.java.com;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do Triangulo");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura do Triangulo");
        double altura = scanner.nextDouble();

        double area = (base * altura)/2;
        System.out.println("A area do Triangulo é: " +area);
    }
}
