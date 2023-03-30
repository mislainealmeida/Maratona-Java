package academy.devdojo.maratonajava.Dcolecoes.teste;

import academy.devdojo.maratonajava.Dcolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.Dcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste03 {
    public static void main(String[] args) {
        Consumidor consumidor1= new Consumidor("Mislaine");
        Consumidor consumidor2= new Consumidor("Eduardo");

        Manga manga1 = new Manga(5L,"Bersek",19.90);
        Manga manga2 = new Manga(2L,"Hellsing Ultimate",20.00);
        Manga manga3 = new Manga(1L,"Pokemon",30.50);
        Manga manga4 = new Manga(3L,"Attack on titan",35.60);
        Manga manga5 = new Manga(4L,"Naruto",40.90);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry: consumidorMangaMap.entrySet()){
            System.out.println("-----------------");
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }

        }


    }




}
