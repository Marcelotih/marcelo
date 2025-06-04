package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividadenew2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        double n = scanner.nextDouble();
        double imparPar = (n % 2);
        if (imparPar <=0){
            System.out.println("numero par");}else{
            System.out.println("numero impar");
        }


        }
    }
