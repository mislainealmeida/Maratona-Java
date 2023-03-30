package academy.devdojo.maratonajava.Dcolecoes.teste;

import academy.devdojo.maratonajava.Dcolecoes.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        String nome = "Willian Suane";
        String nome2 = "Willian Suane";
        String nome3= new String("Willian Suane");
        System.out.println(nome == nome2);//true
        System.out.println(nome == nome3);//false
        System.out.println(nome.equals(nome3));//true

        Smartphone s1= new Smartphone("1ABC", "iPhone");
        Smartphone s2= new Smartphone("1ABC", "iPhone");
        System.out.println(s1==s2);
        //System.out.println(s1.getSerialNumber().equals(s2.getSerialNumber()));
        System.out.println(s1.equals(s2));

    }
}
