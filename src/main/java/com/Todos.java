package main.java.com;

public class Todos {
    public static void main(String[] args) {
        double primeiroNumero = 39;
        double segundoNumero = 100;
        double soma =  primeiroNumero + segundoNumero;
        double subtracao = primeiroNumero - segundoNumero;
        double mult = primeiroNumero * segundoNumero;
        if (segundoNumero <=0){

            System.out.println("Não é possivel executar essa divisão");
        } else { double div = primeiroNumero / segundoNumero;
            System.out.println("o resultado é "  + div);}
        System.out.println("o resultado é "  + soma);
        System.out.println("o resultado é "  + subtracao);
        System.out.println("o resultado é "  + mult);


    }
}
