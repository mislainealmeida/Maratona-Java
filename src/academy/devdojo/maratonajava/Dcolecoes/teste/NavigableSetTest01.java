package academy.devdojo.maratonajava.Dcolecoes.teste;

import academy.devdojo.maratonajava.Dcolecoes.dominio.Manga;
import academy.devdojo.maratonajava.Dcolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPreco implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone= new Smartphone("123", "Nokia");
        System.out.println(set.add(smartphone));

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPreco());
        mangas.add(new Manga(5L,"Bersek",19.90,0));
        mangas.add(new Manga(2L,"Hellsing Ultimate",20.00,5));
        mangas.add(new Manga(7L,"Pokemon",30.50,0));
        mangas.add(new Manga(3L,"Attack on titan",35.60,2));
        mangas.add(new Manga(4L,"Naruto",40.90,0));
        mangas.add(new Manga(1L,"Aaragon",40.90,0));
        for (Manga manga:mangas.descendingSet()){
            System.out.println(manga);
        }




















































































    }
}
