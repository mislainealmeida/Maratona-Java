package academy.devdojo.maratonajava.BorientacaoObjetos.Iassociacao;

public class Aula21Time {
    private String nome;
    private Aula21Jogador[] jogadores;

    public Aula21Time(String nome) {
        this.nome = nome;
    }

    public Aula21Time(String nome, Aula21Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(jogadores == null) return;
        for (Aula21Jogador jogador: jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula21Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Aula21Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}

