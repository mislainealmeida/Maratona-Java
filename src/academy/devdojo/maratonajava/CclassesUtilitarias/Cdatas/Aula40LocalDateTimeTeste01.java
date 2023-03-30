package academy.devdojo.maratonajava.CclassesUtilitarias.Cdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Aula40LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime= LocalDateTime.now();
        LocalDate date1= LocalDate.parse("2023-12-08");
        LocalTime time= LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(localDateTime.getHour());
        System.out.println(date1);
        System.out.println(time);
        LocalDateTime ldt= date1.atTime(time);
        System.out.println(ldt);

    }
}
