package main.java.com;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("casos favoraveis: ");
        int cf = scanner.nextInt();

        System.out.println("casos possiveis: ");
        int cp = scanner.nextInt();
        float probabilidade = (cf*100)/cp;
        System.out.println("a probabilidade é: "+probabilidade+"%");
    }
}
