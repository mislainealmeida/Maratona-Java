package academy.devdojo.maratonajava.Dcolecoes.teste;

import academy.devdojo.maratonajava.Dcolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.Dcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {
        Consumidor consumidor1= new Consumidor("Mislaine");
        Consumidor consumidor2= new Consumidor("Eduardo");

        Manga manga1 = new Manga(5L,"Bersek",19.90);
        Manga manga2 = new Manga(2L,"Hellsing Ultimate",20.00);
        Manga manga3 = new Manga(1L,"Pokemon",30.50);
        Manga manga4 = new Manga(3L,"Attack on titan",35.60);
        Manga manga5 = new Manga(4L,"Naruto",40.90);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey()+ ": "+ entry.getValue());
        }


        System.out.println(consumidor1);
    }




}
