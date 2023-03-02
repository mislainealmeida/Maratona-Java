package academy.devdojo.maratonajava.BorientacaoObjetos.GblocosInicializacao;

public class Aula16Anime {
    private String nome;
    private int[] episodios;
    //1-alocado um espaço em memória do objeto
    //2-Cada atributo de classe é criado e inicializado com valores default
    //3- Bloco de inicialização é executado
    //4- Construtor é executado.
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios= new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i]= i+1;
        }
    }

    public Aula16Anime(String nome) {
        this.nome = nome;
    }

    public Aula16Anime() {

        for (int episodio: this.episodios) {
            System.out.print(episodio+" ");
        }
        System.out.println();


    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }


}
