package switchcase;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o tema do livro: 1: Ficção" +
                " 2: Não Ficção" +
                " 3: Romance" +
                " 4: Terror" +
                " 5: Mistério");
        int livro = scanner.nextInt();
        switch (livro){
            case 1:
                System.out.println("o livro pertence a categoria de Ficção");
                break;
            case 2:
                System.out.println("o livro pertence a categoria de Não Ficção");
                break;
            case 3:
                System.out.println("o livro pertence a categoria de Romance");
                break;
            case 4:
                System.out.println("o livro pertence a categoria de Terror");
                break;
            case 5:
                System.out.println("o livro pertence a categoria de Misterio ");
                break;
            default:
                System.out.println("livro não catalogado");
        }


    }
}
