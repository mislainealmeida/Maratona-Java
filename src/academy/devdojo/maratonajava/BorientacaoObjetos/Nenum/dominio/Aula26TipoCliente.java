package academy.devdojo.maratonajava.BorientacaoObjetos.Nenum.dominio;

public enum Aula26TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica");
    public final int VALOR;
    private String nomeRelatorio;
    Aula26TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR= valor;
        this.nomeRelatorio= nomeRelatorio;
    }

    public static Aula26TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (Aula26TipoCliente tipoCliente: values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return  null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
