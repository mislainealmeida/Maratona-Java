package academy.devdojo.maratonajava.BorientacaoObjetos.exercicios.ex02;

public class Teste {
    public static void main(String[] args) {
        Funcionario ex01Funcionario = new Funcionario();
        ex01Funcionario.nome="Ana";
        ex01Funcionario.idade= 30;
        ex01Funcionario.salarios= new double[]{1200, 987.32, 2000};

        ex01Funcionario.imprimirDados();

    }
}
