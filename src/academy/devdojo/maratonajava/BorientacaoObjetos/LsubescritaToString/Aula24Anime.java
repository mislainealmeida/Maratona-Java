package academy.devdojo.maratonajava.BorientacaoObjetos.LsubescritaToString;

public class Aula24Anime {
    private String nome;

    public Aula24Anime(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Anime: "+ nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
