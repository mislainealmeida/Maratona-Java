package academy.devdojo.maratonajava.Dcolecoes.teste;

import academy.devdojo.maratonajava.Dcolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Bersek", 19.90,0));
        mangas.add(new Manga(2L, "Hellsing Ultimate", 20.00,5));
        mangas.add(new Manga(1L, "Pokemon", 30.50,0));
        mangas.add(new Manga(3L, "Attack on titan", 35.60,2));
        mangas.add(new Manga(4L, "Naruto", 40.90,0));

        for (Manga manga: mangas){
            System.out.println(manga);
        }

    }
}
