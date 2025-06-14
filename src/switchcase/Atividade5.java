package switchcase;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("escolha o metodo de conversão (1) Dolar, (2) Euro, (3) Libra (4) Peso argentino");
        int conv=scanner.nextInt();
        System.out.println("coloque o dinheiro em reais");
        double reais=scanner.nextDouble();

        switch (conv){
            case 1:
                System.out.println("A conversão foi: "+(reais*5.54));

                break;

            case 2:
                System.out.println("A conversão foi: "+(reais*6.40));

                break;

            case 3:
                System.out.println("A conversão foi: "+(reais*7.52));

            case 4:
                System.out.println("A conversão foi: "+(reais*213.20));

                break;

        }
    }
}
