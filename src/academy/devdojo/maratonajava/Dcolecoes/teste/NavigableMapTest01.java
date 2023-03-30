package academy.devdojo.maratonajava.Dcolecoes.teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map= new TreeMap<>();
        map.put("A", "letra A");
        map.put("D", "letra D");
        map.put("B", "letra B");
        map.put("C", "letra C");
        map.put("E", "letra E");

        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        System.out.println(map.headMap("C"));
    }
}
