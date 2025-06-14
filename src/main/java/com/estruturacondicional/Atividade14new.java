package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade14new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primero numero");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = scanner.nextInt();

        if ((n1==0)||(n2==0)){
            System.out.println("Z");
        } else if ((n1 > 0) && (n2 > 0)||((n1<0)&&(n2<0))) {
            System.out.println("M");
        }else {
            System.out.println("O");
        }
    }
}
