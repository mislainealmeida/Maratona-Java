package academy.devdojo.maratonajava.Dcolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>();
        List <String> nomes2 = new ArrayList<>();
        nomes.add("Willian");
        nomes.add("DevDojo");
        nomes.remove("DevDojo");
        //nomes.remove(1);
        nomes2.add("DevDojo2");
        nomes.addAll(nomes2);

        for (String nome: nomes) {
            System.out.println(nome);
        }
        System.out.println("-----------------------");

        nomes.add("Suane");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
