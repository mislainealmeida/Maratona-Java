package academy.devdojo.maratonajava.CclassesUtilitarias.Bstrings;

public class Aula32StringTeste02 {
    public static void main(String[] args) {
        String nome= " Mislaine ";
        String numeros="123456";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("i","y"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,4));
        System.out.println(numeros.substring(0,numeros.length()));
        System.out.println(nome.trim());
    }
}
