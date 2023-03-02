package academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio;

public class Aula29Tomate extends Aula29Produto{
    public static final double IMPOSTO_POR_CENTO= 0.06;
    private String dataValidade;
    public Aula29Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostos() {
        System.out.println("Calculando o imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
