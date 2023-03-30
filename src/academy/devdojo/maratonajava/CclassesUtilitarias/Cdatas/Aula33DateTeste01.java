package academy.devdojo.maratonajava.CclassesUtilitarias.Cdatas;

import java.util.Date;

public class Aula33DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000);
        System.out.println(date);//date.toString
        Date date2 = new Date();
        System.out.println(date2.getTime());//representa o dia de hj
        Date date3 = new Date(1673985107974L);
        System.out.println(date3);
        Date date4 = new Date();
        date4.setTime(date4.getTime()+3_600_000);
        System.out.println(date4);


    }
}
