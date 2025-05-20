package main.java.com;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o preço");
        double preco = scanner.nextDouble();

        System.out.println("digite o percentual de desconto");
        double desconto = scanner.nextDouble();
        double valorFinal = preco-(preco*desconto/100);
    }
}
