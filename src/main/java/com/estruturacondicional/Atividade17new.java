package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade17new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a refeição");
        System.out.println("vegetariano, peixe, frango ou carne");
        String refeicao = scanner.next();
        System.out.println("Digite a sobremesa");
        System.out.println("abacaxi, sorvete ou mousse");
        String sobremesas = scanner.next();
        System.out.println("Digite as bebidas");
        System.out.println("suco ou refri");
        String bebidas = scanner.next();

        int calorias=0;
        if (refeicao.equals("vegetariano")) {
            calorias = 180;
            calorias = calorias + 200;
        } else if (refeicao.equals("peixe")) {
            calorias=230;

        } else if (refeicao.equals("frango")) {
            calorias=250;


        } else if (refeicao.equals("carne")) {
            calorias=350;

        }
        if (sobremesas.equals("abacaxi")){
            calorias=calorias+75;
        } else if (sobremesas.equals("sorvete")) {
            calorias=calorias+110;

        } else if (sobremesas.equals("mousse")) {
            calorias=calorias+200;

        }
        if (bebidas.equals("suco")){
            calorias=calorias+80;
        } else if (bebidas.equals("refrigerante")) {
            calorias=calorias+200;

        }
        System.out.println("as calorias foram: "+calorias);
    }

}

