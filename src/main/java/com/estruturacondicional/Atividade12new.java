package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade12new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o primeiro numero");
        int n1 = scanner.nextInt();
        System.out.println("informe o segundo numero");
        int n2 = scanner.nextInt();
        System.out.println("informe o terceiro numero");
        int n3 = scanner.nextInt();
        int maior = 0;

        if ((n1 == n2) || (n1 == n3) || (n2 == n3)) {

        } else {
            if ((n1 > n2) && (n1 > n3)) {
           maior=n1;

            } else if (n2>n3) {
                maior=n2;
            } else  {
                maior=n3;
            }
            System.out.println("maior numero é " +maior);
        }
    }
}