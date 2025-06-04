package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividadenew5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double b = scanner.nextDouble();
        double soma = (a + b);
        double sub = (a - b);
        double mult = (a * b);
        double div = (a/b);
        if (b<=0) {
            System.out.println("está divisão é impossivel");
        } else {
            System.out.println("O resultado da divisão foi: " +div);
        }
        System.out.println("O resultado da soma foi: " +soma);
        System.out.println("O resultado da subtração foi: " +sub);
        System.out.println("O resultado da multiplicação foi: " +mult);



    }
}