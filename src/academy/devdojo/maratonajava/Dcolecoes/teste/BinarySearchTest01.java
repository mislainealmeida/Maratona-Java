package academy.devdojo.maratonajava.Dcolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        //index 0,1,2,3
        //numer 0,2,3,4

        //(-(ponto de inserção) - 1)
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,0));//deveria ocupar posição 0
        System.out.println(Collections.binarySearch(numeros,-1));//deveria ocuparposição 1
        System.out.println(Collections.binarySearch(numeros,2));//ocupa a posição 1
        System.out.println(Collections.binarySearch(numeros,5));//deveria ocuparposição 4
    }
}
