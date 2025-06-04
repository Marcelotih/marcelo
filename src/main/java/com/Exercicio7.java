package main.java.com;

import java.util.Scanner;

public class Exercicio7   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o primeiro peso: ");
        double p1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite o segundo peso: ");
        double p2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();
        System.out.println("Digite o terceiro peso: ");
        double p3 = scanner.nextDouble();
        double media = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);

        System.out.println("Sua media foi: " +media);
    }
}
