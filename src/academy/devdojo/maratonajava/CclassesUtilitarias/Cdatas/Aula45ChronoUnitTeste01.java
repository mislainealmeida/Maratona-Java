package academy.devdojo.maratonajava.CclassesUtilitarias.Cdatas;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Aula45ChronoUnitTeste01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1993, Month.APRIL, 12, 12,0,0);
        LocalDateTime now= LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
    }
}
