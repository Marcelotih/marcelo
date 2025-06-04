package main.java.com;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distancia");
        double dist = scanner.nextDouble();
        System.out.println("Digite a velocidade media em km");
        double vel = scanner.nextDouble();
        double tempo = (dist/vel);
        System.out.println("O tempo será: " +tempo);

    }
}
