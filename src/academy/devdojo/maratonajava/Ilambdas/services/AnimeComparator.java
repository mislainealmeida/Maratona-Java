package academy.devdojo.maratonajava.Ilambdas.services;

import academy.devdojo.maratonajava.Ilambdas.dominio.Anime;

public class AnimeComparator {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public  int compareByTitleNonStatic(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }


}
