package estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sair = 1;
        int quantidade1825=0;
        int quantidade2650=0;
        int quantidade5165=0;

        while (sair !=0) {
            System.out.println("Digite a idade");
            int idade = scanner.nextInt();

            if (idade>=18 && idade<=25) {
                quantidade1825++;

            } else if ((idade>=26) &&  (idade<=25)){
                quantidade2650++;

            } else if ((idade>=51)&& (idade>=65)) {
                quantidade5165++;

            }
            System.out.println("Digite 0 para sair");
            sair = 0;
        }

    }
}
