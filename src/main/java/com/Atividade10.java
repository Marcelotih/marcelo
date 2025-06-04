package main.java.com;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.println("Digite a hora: ");
        int hora = scanner.nextInt();

        System.out.println("Digite o minuto: ");
        int minuto = scanner.nextInt();

        double media1 = (dia*86400);
        double media2 = (hora*3600);
        double media3 = (minuto*60);
        double total = media1+media2+media3;
        System.out.println("O dia é: " + media1);
        System.out.println("A hora é: " + media2);
        System.out.println("O minuto é: " + media3);
        System.out.println("o total de seg é: "+total );
    }
}
