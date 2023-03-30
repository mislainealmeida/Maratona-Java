package academy.devdojo.maratonajava.Dcolecoes.teste;

import academy.devdojo.maratonajava.Dcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getNome().compareTo(manga2.getNome());
    }
}

public class MangaListSortTest02 {
    public static void main(String[] args) {
        List<Manga> mangas= new ArrayList<>();
        mangas.add(new Manga(5L,"Bersek",19.90));
        mangas.add(new Manga(2L,"Hellsing Ultimate",20.00));
        mangas.add(new Manga(1L,"Pokemon",30.50));
        mangas.add(new Manga(3L,"Attack on titan",35.60));
        mangas.add(new Manga(4L,"Naruto",40.90));
        for (Manga manga : mangas){
            System.out.println(manga);
        }
        System.out.println("-----------------");

        Collections.sort(mangas);
        for (Manga manga: mangas){
            System.out.println(manga);
        }

        System.out.println("------------------");
        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga: mangas){
            System.out.println(manga);
        }


    }
}
