package academy.devdojo.maratonajava.CclassesUtilitarias.Cdatas;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Aula39LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime time= LocalTime.of(17, 30, 50);
        LocalTime time2= LocalTime.now();
        System.out.println(time);
        System.out.println(time2);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);
    }
}
