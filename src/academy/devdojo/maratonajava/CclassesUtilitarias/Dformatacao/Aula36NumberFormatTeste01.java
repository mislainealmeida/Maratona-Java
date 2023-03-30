package academy.devdojo.maratonajava.CclassesUtilitarias.Dformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Aula36NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale localJP= Locale.JAPAN;
        Locale local = Locale.getDefault();
        Locale localIT=Locale.ITALY;
        Locale localPT= new Locale("pt","BR");

        NumberFormat[] nfa= new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(localJP);
        nfa[1] = NumberFormat.getInstance(local);
        nfa[2] = NumberFormat.getInstance(localIT);
        nfa[3] = NumberFormat.getInstance(localPT); 
        
        double valor = 10_000.2130;
        for (NumberFormat numberFormat: nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString="1000.2130";
        try{
            System.out.println(nfa[0].parse(valorString));
        }catch(ParseException e){
            e.printStackTrace();
        }

    }
}
