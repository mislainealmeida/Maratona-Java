package academy.devdojo.maratonajava.CclassesUtilitarias.Cdatas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Aula44PeriodTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears= LocalDate.now().plusYears(2).plusDays(7);
        Period p1= Period.between(now,nowAfterTwoYears);
        Period p2=Period.ofDays(10);
        Period p3=Period.ofWeeks(41);
        Period p4=Period.ofMonths(3);
        Period p5=Period.ofYears(3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println(p3.getMonths());
        System.out.println(Period.between(now, now.plusDays(p3.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));
    }
}
