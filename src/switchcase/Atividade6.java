package switchcase;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite dois numeros");
        double n1=scanner.nextDouble();
        double n2=scanner.nextDouble();
        System.out.println("Escolha a operação: (1)Soma,(2)Subtração,(3)Multiplicação,(4)Divisão");
        int op= scanner.nextInt();//operação

        switch (op){
            case 1:
                System.out.println("a operação foi: "+n1+n2);
                break;

            case 2:
                System.out.println("a operação foi: "+(n1-n2));
                break;

            case 3:
                System.out.println("a operação foi: "+n1*n2);
                break;

            case 4:
                if (n2==0)
                System.out.println("impossivel");
                else
                System.out.println("a operação foi: "+n1/n2);
            default:
                System.out.println("não está nos relacionados");
                break;

        }

    }
}
