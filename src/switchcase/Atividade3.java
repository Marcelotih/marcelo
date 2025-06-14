package switchcase;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de X de 1 a 5");
        int X = scanner.nextInt();

        System.out.println("Digite o valor de A");
        double A = scanner.nextInt();

        System.out.println("Digite o valor de B");
        double B = scanner.nextInt();
        double maior = 0;
        double menor = 0;

        double resultado = 0.0;
        switch (X) {
            case 1:
                resultado=A+B;
                System.out.println(resultado);
                break;

            case 2:
                resultado=A/B;
                System.out.println(resultado);
                break;

            case 3:
                if (A>B) maior=A;
                else menor=A;
                if (B>A) maior=B;
                else menor=B;


                System.out.println(maior+","+menor);
                break;

            case 4:
            if (A>B){
                System.out.println("A diferença é"+ (A-B));

            }else System.out.println("A diferença é "+B+A);

            break;

            case 5:
                resultado=(A+B)/2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("erro babaca");

        }
    }
}