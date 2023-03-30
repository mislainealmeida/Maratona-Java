package academy.devdojo.maratonajava.CclassesUtilitarias.Fregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    public static void main(String[] args) {
        String regex= "aba";
        String texto= "abababa";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(texto);
        pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
