package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade10new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        if (idade<16){
            System.out.println("você não pode votar");





    } else if ((idade >=16)&&(idade<=17)){
            System.out.println("voto opcional");
        } else if ((idade>=18)&&(idade<=60)) {
            System.out.println("voto obrigatorio");
        } else {
            System.out.println("voto opcional");

        }

    }
    }
