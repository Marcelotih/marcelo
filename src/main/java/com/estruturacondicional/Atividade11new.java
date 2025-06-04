package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade11new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade");
        int quant = scanner.nextInt();
        if ((quant>=1)&&(quant<=10)){
            System.out.println(quant*0.10);
        } else if ((quant>11)&&(quant<50)) {
            System.out.println(quant*0.08);
        } else if (quant>51) {
            System.out.println(quant*0.05);

        }

    }
}
