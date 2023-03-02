package academy.devdojo.maratonajava.BorientacaoObjetos.Jscanner;

import java.util.Scanner;

public class Aula22Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome a baixo");
        String nome= entrada.nextLine();
        System.out.println("Digite sua idade");
        int idade= entrada.nextInt();
        System.out.println("Digite  M ou F para seu sexo");
        char sexo= entrada.next().charAt(0);
        System.out.println("--------------");
        System.out.println("Nome "+nome);
        System.out.println("Idade "+idade);
        System.out.println("Sexo "+sexo);
    }
}
