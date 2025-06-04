package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade8new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int n = scanner.nextInt();
        if (n<0){
            n=n*-1;
        }
        if (n<10){
            System.out.println("unidade");
        } else if (n<100){
            System.out.println("dezena");

        } else if (n<1000) {
            System.out.println("centena");

        }


    }
}
