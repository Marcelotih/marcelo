package switchcase;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("digite um numero de 1 a 7");
        int semana= scanner.nextInt();

        switch (semana){
            case 1:
                System.out.println("domingo");
                break;

            case 2:
                System.out.println("segunda");
                break;

            case 3:
                System.out.println("terça");
                break;

            case 4:
                System.out.println("quarta");
                break;

            case 5:
                System.out.println("quinta");
                break;

            case 6:
                System.out.println("sexta");
                break;

            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("NÃO ESTÁ RELACIONADO K7");
        }
    }
}
