package academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio;

public class Aula29Televisao extends Aula29Produto{
    public static final double IMPOSTO_POR_CENTO= 0.21;

    public Aula29Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostos() {
        System.out.println("Calculando imposto da televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
