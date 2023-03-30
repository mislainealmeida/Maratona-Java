package academy.devdojo.maratonajava.Dcolecoes.teste;

import academy.devdojo.maratonajava.Dcolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {
        Smartphone s1= new Smartphone("1ABC", "iPhone");
        Smartphone s2= new Smartphone("2ABC", "Pixel");
        Smartphone s3= new Smartphone("3ABC", "Samsung");
        List<Smartphone> smartphones= new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        smartphones.add(0,s3);
        //smartphones.clear();//deleta tudo que esta no list


        for (Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4= new Smartphone("2ABC", "Pixel");
        System.out.println(smartphones.contains(s4));
        System.out.println(smartphones.indexOf(s4));
        System.out.println(smartphones.get(0));

    }
}
