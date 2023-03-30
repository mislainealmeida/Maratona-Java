package academy.devdojo.maratonajava.Dcolecoes.teste;

import academy.devdojo.maratonajava.Dcolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.Dcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class QueueTest02 {
    public static void main(String[] args) {

        /*Consumidor consumidor= new Consumidor("Mislaine");
        Queue<Consumidor> consumidorQueue = new PriorityQueue<>();
        consumidorQueue.add(consumidor);*/

        Queue<Manga> mangas = new PriorityQueue<>(new MangaPreco().reversed());
        mangas.add(new Manga(5L,"Bersek",19.90,0));
        mangas.add(new Manga(2L,"Hellsing Ultimate",20.00,5));
        mangas.add(new Manga(7L,"Pokemon",30.50,0));
        mangas.add(new Manga(3L,"Attack on titan",35.60,2));
        mangas.add(new Manga(4L,"Naruto",40.90,0));
        mangas.add(new Manga(1L,"Aaragon",40.90,0));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
