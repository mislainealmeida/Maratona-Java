package academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.teste;

import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio.Aula29Computador;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio.Aula29Televisao;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio.Aula29Tomate;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.servico.Aula29CalculadoraImposto;

public class Aula29Teste {
    public static void main(String[] args) {
        Aula29Computador computador = new Aula29Computador("NUC18i7", 11000);
        Aula29Tomate tomate = new Aula29Tomate("Tomate 1", 10);
        Aula29Televisao tv= new Aula29Televisao("Samsung 50\"",50000 );
        Aula29CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------");
        Aula29CalculadoraImposto.calcularImposto(tv);
        System.out.println("----------------------");
        Aula29CalculadoraImposto.calcularImposto(tv);
    }
}
