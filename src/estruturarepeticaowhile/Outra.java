package estruturarepeticaowhile;

import java.util.Scanner;

public class Outra {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double totalNotas=0.0;
        double nota = 0.0;
        int contador=0;
        int saida=0;
        while(saida!=3){
            System.out.println("informe a nota");
            nota= scanner.nextDouble();
            totalNotas = totalNotas+nota;
            contador=contador+1;
            System.out.println("digite 3 para sair");
            saida = scanner.nextInt();
        }
        double media=totalNotas/contador;
        System.out.println("a media é: "+media);
    }
}
