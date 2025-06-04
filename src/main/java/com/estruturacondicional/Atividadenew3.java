package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividadenew3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double valor1 = scanner.nextDouble(); //valor pode ser negativo

        System.out.println("Digite o valor: ");
        double valor2 = scanner.nextDouble();
        double algoritimo = (valor1 - valor2);
        if (algoritimo < 0) {
            System.out.println("Seu numero está negativo aqui está o positivo: " + (algoritimo-algoritimo*2));
        } else {
            System.out.println("Aqui está o valor: " + algoritimo);


        }
    }
}
