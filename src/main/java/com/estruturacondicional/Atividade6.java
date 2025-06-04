package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double n2 = scanner.nextDouble();
        double maior= 0.0;
        if (n2>n1){
           maior = n1 ;
        }else {
            maior = n2;
        }
       maior = (n1>n2)? n1 : n2;
        System.out.println("O maior numero é: "+maior);



    }
}
