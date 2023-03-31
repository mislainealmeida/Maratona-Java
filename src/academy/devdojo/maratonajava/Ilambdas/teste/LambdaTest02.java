package academy.devdojo.maratonajava.Ilambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List <String> strings= List.of("Matsu","Allucard");
        //List <Integer> integers= map(strings,(String s)->s.length());
        List <Integer> integers= map(strings, String::length);
        //List <String> st= map(strings, s-> s.toUpperCase());
        List <String> st= map(strings, String::toUpperCase);
        System.out.println(integers);
        System.out.println(st);
    }
    private static  <T,R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e: list){
           R r= function.apply(e);
            result.add(r);
        }
        return result;
    }
}
