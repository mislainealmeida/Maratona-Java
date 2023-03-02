package academy.devdojo.maratonajava.BorientacaoObjetos.Hmodificadores;

public class Aula18Anime {
    private String nome;
    private static int[] episodios;
    //0-Bloco de inicialização é executado quando a JVM carregar a classe.
    //1-alocado um espaço em memória do objeto.
    //2-Cada atributo de classe é criado e inicializado com valores default.
    //3- Bloco de inicialização é executado.
    //4- Construtor é executado.


    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios= new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i]= i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }
    {
        System.out.println("Dentro do bloco de inicialização NÃO ESTÁTICO");
    }

    public Aula18Anime(String nome) {
        this.nome = nome;
    }

    public Aula18Anime() {

        for (int episodio: Aula18Anime.episodios) {
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



}
