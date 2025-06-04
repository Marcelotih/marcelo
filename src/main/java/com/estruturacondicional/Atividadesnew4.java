package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividadesnew4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        if (media <= 7) {
            System.out.println("reprovado "+media + " aluno: " +nome);
        } else {
            System.out.println("aprovado: " +media + " aluno: " +nome);

        }
    }
}