package academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.dominio;

public abstract class Aula29Produto implements Aula29Taxavel{

    protected String nome;
    protected double valor;

    public Aula29Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
