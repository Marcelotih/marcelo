package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade15new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o produto");
        String nome = scanner.nextLine();

        System.out.println("digite o peso em kg");
        double peso = scanner.nextDouble();

        System.out.println("digite o tipo 1 para sedex e 2 sedex 10");
        int tipo= scanner.nextInt();

        System.out.println("digite a região: 1 norte, 2 nordeste, 3 centro oeste, 4 sudeste, 5 sul ");
        int regiao = scanner.nextInt();


        double valorTotal = 0.0;

        if (peso <= 1){
            valorTotal = 5;
        } else if (peso <= 5) {
            valorTotal = 10;
        } else {
            valorTotal = 15;
        }

        if (tipo == 1){
            valorTotal = valorTotal + 9;
        } else {
            valorTotal = valorTotal + 11;
        }if (regiao==1) {
            valorTotal = valorTotal + 4;

        } else if (regiao==2) {
            valorTotal = valorTotal+2;
        } else if (regiao==3) {
            valorTotal=valorTotal+5;
            
        } else if (regiao==4) {
            valorTotal=valorTotal+2;
        } else {
            valorTotal=valorTotal+3;
        }
        System.out.println("o valor total do produto" + nome+ " é: " +valorTotal);

    }
}
