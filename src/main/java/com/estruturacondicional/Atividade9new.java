package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade9new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        double p1 = scanner.nextDouble();

        System.out.println("digite o segundo numero");
        double p2 = scanner.nextDouble();
        if (p1 != p2) {


            if (p1 > p2) {
                System.out.println("o resultado foi: " + (p1 + p2));
            } else {
                System.out.println("o resultado foi: " + p2 * p1);

            }
        }
    }
}