package academy.devdojo.maratonajava.BorientacaoObjetos.Fconstrutores;

public class Aula15Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;
    private String estudio;

    public Aula15Anime(String nome, String tipo, int episodio,  String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;
    }

    public Aula15Anime(String nome, String tipo, int episodio, String genero, String estudio) {
        this(nome, tipo, episodio, genero);
        this.estudio = estudio;
    }

    public Aula15Anime() {
        System.out.println("Dentro do construtor sem argumentos ");
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
