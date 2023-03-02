package academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.exception.teste;

import academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.exception.dominio.Aula30Funcionario;
import academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.exception.dominio.Aula30Pessoa;



public class Aula30SobrescritaExceptionTeste01 {
    public static void main(String[] args) {
        Aula30Pessoa pessoa = new Aula30Pessoa();
        Aula30Funcionario funcionario = new Aula30Funcionario();

        funcionario.salvar();
    }
}
