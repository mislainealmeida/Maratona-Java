package academy.devdojo.maratonajava.CclassesUtilitarias.Cdatas;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;
public class Aula48ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shortIds=ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone= ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now= LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime= now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowInstant= Instant.now();
        System.out.println(nowInstant);//horário militar
        ZonedDateTime zonedDateTime1= nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        ZoneOffset offset= ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime= now.atOffset(offset);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime1= OffsetDateTime.of(now, offset);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime3= nowInstant.atOffset(offset);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate= JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEra= LocalDate.of(1900,2,1);
        JapaneseDate japaneseDate2= JapaneseDate.from(meijiEra);
        System.out.println(japaneseDate2);


    }
}
