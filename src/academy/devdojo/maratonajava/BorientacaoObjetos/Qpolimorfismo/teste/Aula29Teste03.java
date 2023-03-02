package academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.teste;

import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio.Aula29Computador;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio.Aula29Produto;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio.Aula29Tomate;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.servico.Aula29CalculadoraImposto;

public class Aula29Teste03 {
    public static void main(String[] args) {
        Aula29Produto produto = new Aula29Computador("Rysen 9", 3000);


        Aula29Tomate tomate= new Aula29Tomate("Tomate 1", 20);
        tomate.setDataValidade("11/01/2023");

        Aula29CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        Aula29CalculadoraImposto.calcularImposto(produto);



    }
}
