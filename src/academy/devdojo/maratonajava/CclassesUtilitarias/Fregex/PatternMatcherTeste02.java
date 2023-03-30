package academy.devdojo.maratonajava.CclassesUtilitarias.Fregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        // \d= Todos os dígitos
        // \D= Tudo o que não for dígito
        // \s= Espaços em branco
        // \S= Todos os caracteres excluindo os espaços em branco
        // \w= a-ZA-Z, dígitos, -
        // \W= tudo que não for incluso no \w
        //  [] = entre os colchetes significa ou [abc] ou por a, ou por b, ou por c
        // os números hexadecimais precisam começar com 0X
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        //{n,m} de n até m
        // () agrupamento
        // | ou
        // $ fim da linha
        // . 1.3 = tudo que estiver entre 1 e 3 Ex: 1@3
        String regex= "\\d";
        String texto= "c3d456EfGHIJac13";
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

        int numeroHexa= 0x59F86A;
        System.out.println(numeroHexa);
    }
}
