package main.java.com;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        double dia = scanner.nextDouble();

        System.out.println("Digite a hora: ");
        double hora = scanner.nextDouble();

        System.out.println("Digite o minuto: ");
        double minuto = scanner.nextDouble();

        double media1 = (dia*86400);
        double media2 = (hora*3600);
        double media3 = (minuto*60);

        System.out.println("O dia é: " + media1);
        System.out.println("A hora é: " + media2);
        System.out.println("O minuto é: " + media3);
    }
}
