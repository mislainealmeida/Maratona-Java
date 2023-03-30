package academy.devdojo.maratonajava.CclassesUtilitarias.Cdatas;

import java.time.Instant;
import java.time.LocalDateTime;

public class Aula41InstantTeste01 {
    public static void main(String[] args) {
        Instant now= Instant.now();
        System.out.println(now);//2023-01-19T14:45:08.218857600Z, este z representa o zulo time(horário militar)
        System.out.println(LocalDateTime.now());//2023-01-19T11:45:08.302805800
        System.out.println(now.getNano());
        System.out.println(now.getEpochSecond());

    }
}
