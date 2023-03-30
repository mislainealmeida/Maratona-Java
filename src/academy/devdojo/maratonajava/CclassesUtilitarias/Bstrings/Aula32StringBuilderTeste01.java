package academy.devdojo.maratonajava.CclassesUtilitarias.Bstrings;

public class Aula32StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Willian Suane";
        nome.concat(" DevDojo");
        nome = nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb= new StringBuilder("Willian Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.substring(0,3);
        System.out.println(sb);

    }
}
