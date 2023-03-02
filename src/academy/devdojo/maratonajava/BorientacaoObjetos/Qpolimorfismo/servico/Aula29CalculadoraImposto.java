package academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.servico;

import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio.Aula29Produto;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio.Aula29Tomate;


public class Aula29CalculadoraImposto {

    public static void calcularImposto(Aula29Produto produto){
        System.out.println("Relatório de imposto");
        double imposto= produto.calcularImpostos();
        System.out.println("Produto "+produto.getNome());
        System.out.println("Preço "+produto.getValor());
        System.out.println("Imposto a ser pago "+imposto);
        if (produto instanceof Aula29Tomate) {
            /*Aula29Tomate tomate = (Aula29Tomate) produto;
            System.out.println(tomate.getDataValidade());*/

            String dataValidade= ((Aula29Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
