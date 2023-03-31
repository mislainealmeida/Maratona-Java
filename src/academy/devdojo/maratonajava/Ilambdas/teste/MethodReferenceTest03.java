package academy.devdojo.maratonajava.Ilambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list=  new ArrayList<>(List.of("Rimuru","Veldora","Hikimaru"));
        list.sort((String::compareTo));
        System.out.println(list);

        Function<String, Integer> numStringToInteger= Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> cheackName= List::contains;
        System.out.println(cheackName.test(list, "Rimuru"));



    }
}
