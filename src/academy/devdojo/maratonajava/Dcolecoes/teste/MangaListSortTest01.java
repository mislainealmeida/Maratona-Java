package academy.devdojo.maratonajava.Dcolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas= new ArrayList<>();
        mangas.add("Bersek");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Naruto");
        Collections.sort(mangas);

        for (String manga:mangas){
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.90);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

        //new Manga(null, null, 0);

    }
}
