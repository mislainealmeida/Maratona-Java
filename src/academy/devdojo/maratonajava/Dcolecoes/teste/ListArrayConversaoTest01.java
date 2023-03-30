package academy.devdojo.maratonajava.Dcolecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] intergersArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intergersArray));
        System.out.println(Arrays.toString(numeros.toArray(new Integer[0])));
        System.out.println("---------------------------");
        Integer [] numerosArray= new Integer[3];
        numerosArray[0]=1;
        numerosArray[1]=2;
        numerosArray[2]=3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);
        System.out.println("-------------------------------");

        List <Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        List<Integer> nume= Arrays.asList(1,2,3,4,5);//criar em uma única linha
        System.out.println(List.of(1,2,3));// a partir da versão 11
    }
}
