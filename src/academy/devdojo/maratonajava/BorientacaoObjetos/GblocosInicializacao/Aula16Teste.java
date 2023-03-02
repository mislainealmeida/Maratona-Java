package academy.devdojo.maratonajava.BorientacaoObjetos.GblocosInicializacao;

public class Aula16Teste {
    public static void main(String[] args) {
        Aula16Anime anime = new Aula16Anime( );
        for (int episodio:anime.getEpisodios()){
            System.out.print(episodio+" ");
        }
        System.out.println(anime.getEpisodios());

    }
}

