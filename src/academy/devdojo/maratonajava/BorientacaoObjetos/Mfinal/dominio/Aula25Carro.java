package academy.devdojo.maratonajava.BorientacaoObjetos.Mfinal.dominio;

public class Aula25Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE= 250;
    public final Aula25Comprador COMPRADOR = new Aula25Comprador();
    //a referencia que essa variável tem para esse objeto nunca poderá ser alterada.


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
