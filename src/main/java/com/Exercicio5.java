package main.java.com;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o percentual: ");
        double percentual = scanner.nextDouble();
        double aumentoSalarial = salario + (salario * percentual / 100);

        System.out.println("Aqui está o calculo: "+aumentoSalarial);


    }
}
