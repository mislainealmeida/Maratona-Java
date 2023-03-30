package academy.devdojo.maratonajava.CclassesUtilitarias.Dformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Aula35LocaleTeste01 {
    public static void main(String[] args) {
        Locale local = new Locale("it","IT");
        Locale local1 = new Locale("it","CH");
        Locale local2 = new Locale("pt","BR");
        Locale local3 = new Locale("hi","IN");
        Locale local4 = new Locale("ja","JP");

        Calendar c = new GregorianCalendar();
        DateFormat df= DateFormat.getDateInstance(DateFormat.FULL, local);
        DateFormat df1= DateFormat.getDateInstance(DateFormat.FULL, local1);
        DateFormat df2= DateFormat.getDateInstance(DateFormat.FULL, local2);
        DateFormat df3= DateFormat.getDateInstance(DateFormat.FULL, local3);
        DateFormat df4= DateFormat.getDateInstance(DateFormat.FULL, local4);

        System.out.println("Italia: "+df.format(c.getTime()));
        System.out.println("Suiça: "+df1.format(c.getTime()));
        System.out.println("Brasil: "+df2.format(c.getTime()));
        System.out.println("India: "+df3.format(c.getTime()));
        System.out.println("Japão: "+df4.format(c.getTime()));
        System.out.println("-------------------------------");
        System.out.println(local.getDisplayCountry(Locale.UK));
        System.out.println(local1.getDisplayCountry());
        System.out.println(local2.getDisplayCountry(Locale.US));
        System.out.println(local3.getDisplayCountry());
        System.out.println(local4.getDisplayCountry());
    }
}
