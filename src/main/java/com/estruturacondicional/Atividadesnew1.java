package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividadesnew1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAIORIDADE = 18;

        int idade = scanner.nextInt();




        if (idade > MAIORIDADE) {
            System.out.println("Maior de idade");
        } else if (idade==MAIORIDADE) {
            System.out.println("Idade igual a 18 anos");
        }else {
            System.out.println("Menor de idade");
        }
    }
}
