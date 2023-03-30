package academy.devdojo.maratonajava.Dcolecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("B");
        fila.add("A");

       /* for (String s: fila){
            System.out.println(s);
        }
        System.out.println(fila);*/

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
