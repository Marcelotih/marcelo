package estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int soma = 0;

        while (contador < 10) {
            System.out.print("digite o numero ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                soma=soma + numero;
            }

            contador++;
        }

        System.out.println("A soma dos números é: " +soma);
    }
}