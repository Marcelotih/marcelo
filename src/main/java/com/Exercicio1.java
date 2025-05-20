package main.java.com;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do motorista: ");
        String nome = scanner.nextLine();

        System.out.println("Distancia percorrrida em km: ");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o tempo em horas: ");
        double tempo = scanner.nextDouble();
        double velocidadeMedia = (distancia/tempo);

        System.out.println("A velocidade media foi: "+velocidadeMedia);

    }
}
