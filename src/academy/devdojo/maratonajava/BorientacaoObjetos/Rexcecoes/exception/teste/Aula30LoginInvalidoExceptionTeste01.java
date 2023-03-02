package academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.exception.teste;

import academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.exception.dominio.Aula30LoginInvalidaException;

import java.util.Scanner;

public class Aula30LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (Aula30LoginInvalidaException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws Aula30LoginInvalidaException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB= "ssj";
        System.out.println("Usuário");
        String usernameDigitado=teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada=teclado.nextLine();
        if(!usernameDB.equals(usernameDB) || !senhaDB.equals(senhaDigitada)){
            throw new Aula30LoginInvalidaException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
