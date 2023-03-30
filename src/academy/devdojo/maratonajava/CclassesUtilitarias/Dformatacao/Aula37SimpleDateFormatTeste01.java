package academy.devdojo.maratonajava.CclassesUtilitarias.Dformatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula37SimpleDateFormatTeste01 {
    public static void main(String[] args) {
        String pattern="'Amsterdam' dd 'de' MMM 'de' yyyy";
        SimpleDateFormat sdf= new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Amsterdam 18 de jan. de 2023"));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
