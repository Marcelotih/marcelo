package estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saida = 0;
        String nome ="";
        int quantidadeAlunos=0;
        
        
        while (saida!=1){
            System.out.println("digite o nome do aluno");
            nome=scanner.next();
            quantidadeAlunos=quantidadeAlunos+1;
            System.out.println("digite um numero diferente de 1 para sair");
            saida= scanner.nextInt();
        }
        System.out.println("a quantidades de alunos é: "+quantidadeAlunos);
      }
    }

