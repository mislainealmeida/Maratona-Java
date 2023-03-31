package academy.devdojo.maratonajava.Ilambdas.teste;

import academy.devdojo.maratonajava.Ilambdas.dominio.Anime;
import academy.devdojo.maratonajava.Ilambdas.services.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList= new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)));

        //Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));//2 chamadas
        //Collections.sort(animeList, (a1, a2) -> AnimeComparator.compareByTitle(a1,a2));//1 chamada
        Collections.sort(animeList, AnimeComparator::compareByTitle);

        System.out.println(animeList);
    }
}
