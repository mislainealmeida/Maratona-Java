package academy.devdojo.maratonajava.CclassesUtilitarias.Dformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Aula36NumberFormatTeste02 {
    public static void main(String[] args) {
        Locale localJP= Locale.JAPAN;
        Locale local = Locale.getDefault();
        Locale localIT=Locale.ITALY;
        Locale localPT= new Locale("pt","BR");

        NumberFormat[] nfa= new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(localJP);
        nfa[1] = NumberFormat.getCurrencyInstance(local);
        nfa[2] = NumberFormat.getCurrencyInstance(localIT);
        nfa[3] = NumberFormat.getCurrencyInstance(localPT);

        double valor = 10_000.2130;
        for (NumberFormat numberFormat: nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
        String valorString="10.000,21 €";//copiei e colei o valor da moeda do console.
        try{
            System.out.println(nfa[2].parse(valorString));
        }catch(ParseException e){
            e.printStackTrace();
        }





    }
}
