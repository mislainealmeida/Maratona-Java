package academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.teste;

import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio.Aula29Computador;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio.Aula29Produto;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio.Aula29Tomate;

public class Aula29Teste02 {
    public static void main(String[] args) {
        Aula29Produto produto = new Aula29Computador("Rysen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImpostos());
        System.out.println("-------------------");

        Aula29Produto produto2 = new Aula29Tomate("Tomate 1", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImpostos());


    }

}
