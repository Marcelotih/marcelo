package switchcase;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a nota até 10 com numeros inteiros");
        int num=scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("insuficiente");
                break;

            case 2:
                System.out.println("insuficiente");
                break;

            case 3:
                System.out.println("insuficiente");
                break;

            case 4:
                System.out.println("regular");
                break;

            case 5:
                System.out.println("regular");
                break;

            case 6:
                System.out.println("bom");
                break;

            case 7:
                System.out.println("bom");
                break;

            case 8:
                System.out.println("muito bom");
                break;

            case 9:
                System.out.println("muito bom");
                break;

            case 10:
                System.out.println("excelente");
                break;
        }
    }
}
