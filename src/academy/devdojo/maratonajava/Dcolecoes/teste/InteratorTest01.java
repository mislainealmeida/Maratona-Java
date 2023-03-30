package academy.devdojo.maratonajava.Dcolecoes.teste;

import academy.devdojo.maratonajava.Dcolecoes.dominio.Manga;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InteratorTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Bersek", 19.90,0));
        mangas.add(new Manga(2L, "Hellsing Ultimate", 20.00,5));
        mangas.add(new Manga(1L, "Pokemon", 30.50,0));
        mangas.add(new Manga(3L, "Attack on titan", 35.60,2));
        mangas.add(new Manga(4L, "Naruto", 40.90,0));

       /* Iterator<Manga> mangaIterator= mangas.iterator();
        while(mangaIterator.hasNext()){
            if(mangaIterator.next().getQuantidade()==0){
                mangaIterator.remove();
            }
        }*/


        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);

    }
}
