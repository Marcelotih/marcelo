package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade13new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe os numero");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int maior = 0;
        int medio = 0;
        int menor = 0;
        if ((n1>n2)&&(n1>n3)){
            maior=n1;
        } else if (n1<n2 && n1>n3) {
            medio=n1;
        } else if (n1>n2 && n1<n3) {
            medio=n1;
        } else if (n1<n2 && n1<n3) {
            menor=n1;
        } if (n2>n1 && n2>n3) {
            maior=n2;
        } else if (n2<n1 && n2>n3) {
            medio=n2;
        } else if (n2>n1 && n2<n3) {
            medio=n2;
        } else if (n2<n1 && n2<n3) {
            menor=n2;

        }if (n3>n1 && n3>n2){
            maior=n3;
        } else if (n3<n1 && n3>n2) {
            medio=n3;
        } else if (n3>n1 && n3<n2) {
            medio=n3;
        } else if (n3<n1 && n3<n2) {
            menor=n3;
        }
        System.out.println("a ordem crescente é: "  + maior + ", " + medio + ", " + menor);
    }
}
