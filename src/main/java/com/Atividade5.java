package main.java.com;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dividendo: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o divisor: ");
        double segundoNumero = scanner.nextDouble();

        double quociente = (primeiroNumero/segundoNumero);
        double restoDivisao = (primeiroNumero%segundoNumero);
        System.out.println("O quociente será: " +quociente);
        System.out.println("O resto da divisão será: " +restoDivisao);
    }
}
