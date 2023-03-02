package academy.devdojo.maratonajava.BorientacaoObjetos.exercicios.ex03;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = scan.nextLine();

        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
    }
}
