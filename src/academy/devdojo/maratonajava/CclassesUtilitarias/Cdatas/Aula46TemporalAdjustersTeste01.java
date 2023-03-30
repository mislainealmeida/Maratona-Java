package academy.devdojo.maratonajava.CclassesUtilitarias.Cdatas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Aula46TemporalAdjustersTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        now= now.withDayOfMonth(15);
        System.out.println(now);

        now= LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(now);

        now= LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println(now);

        now= LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);


    }
}
