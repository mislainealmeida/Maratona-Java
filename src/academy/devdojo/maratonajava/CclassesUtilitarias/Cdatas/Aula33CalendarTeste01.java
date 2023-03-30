package academy.devdojo.maratonajava.CclassesUtilitarias.Cdatas;

import java.util.Calendar;
import java.util.Date;
public class Aula33CalendarTeste01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        c.add(Calendar.HOUR, 2);

        Date date= c.getTime();
        System.out.println(date);


    }
}
