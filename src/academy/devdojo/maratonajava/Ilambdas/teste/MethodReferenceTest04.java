package academy.devdojo.maratonajava.Ilambdas.teste;

import academy.devdojo.maratonajava.Ilambdas.dominio.Anime;
import academy.devdojo.maratonajava.Ilambdas.services.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> newAnimeComparators = AnimeComparator::new;
        AnimeComparator animeComparator= newAnimeComparators.get();//criando um objeto
        List<Anime> animeList= new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)));
        animeList.sort(animeComparator::compareByTitleNonStatic);
        System.out.println(animeList);

        BiFunction <String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction <String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Super campeões", 30));



    }
}
