package academy.devdojo.maratonajava.Ilambdas.teste;

import academy.devdojo.maratonajava.Ilambdas.dominio.Anime;
import academy.devdojo.maratonajava.Ilambdas.services.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparator animeComparator= new AnimeComparator();
        List<Anime> animeList= new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)));

        //animeList.sort((a1, a2) -> animeComparator.compareByTitleNonStatic(a1,a2));
        animeList.sort(animeComparator::compareByTitleNonStatic);
        System.out.println(animeList);

    }
}
