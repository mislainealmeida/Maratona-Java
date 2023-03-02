package academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio;

public class Aula29Computador extends Aula29Produto{
    public static final double IMPOSTO_POR_CENTO= 0.21;

    public Aula29Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostos() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }



}
