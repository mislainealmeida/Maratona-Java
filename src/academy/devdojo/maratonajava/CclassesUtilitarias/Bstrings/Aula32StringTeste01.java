package academy.devdojo.maratonajava.CclassesUtilitarias.Bstrings;

public class Aula32StringTeste01 {
    public static void main(String[] args) {
        String nome = "Mislaine";//String constant pool
        String nome2 = "Mislaine";
        System.out.println(nome == nome2);
        nome.concat(" Almeida");//nome +=" Suane";
        System.out.println(nome);
        System.out.println(nome == nome2);
        nome = nome.concat(" Almeida");
        System.out.println(nome == nome2);
        String nome3 = new String("Mislaine");
        System.out.println(nome2 == nome3);

    }
}
