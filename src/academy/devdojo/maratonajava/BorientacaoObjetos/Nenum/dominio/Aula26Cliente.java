package academy.devdojo.maratonajava.BorientacaoObjetos.Nenum.dominio;

public class Aula26Cliente {
    /*public enum TipoPagamento{
        DEBITO,CREDITO;
    }*/


    private String nome;
    private Aula26TipoCliente tipoCliente;
    private Aula26TipoPagamento tipoPagamento;

    public Aula26Cliente(String nome, Aula26TipoCliente tipoCliente, Aula26TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Aula26Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula26TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Aula26TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Aula26TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento( Aula26TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
