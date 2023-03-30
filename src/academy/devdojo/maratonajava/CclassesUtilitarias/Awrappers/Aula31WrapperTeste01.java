package academy.devdojo.maratonajava.CclassesUtilitarias.Awrappers;

public class Aula31WrapperTeste01 {
    public static void main(String[] args) {
        //Tipos Primitivos
        byte byteP=1;
        short shortP=1;
        int intP=1;
        long longP=10L;
        float floatP=10F;
        double doubleP=100.0;
        char charP='W';
        boolean booleanP= false;

        //Tipos Wrappers
        Byte byteW=127 ;
        Short shortW=1;
        Integer intW=1;//autoboxing
        Long longW=10L;
        Float floatW=10F;
        Double doubleW= 100.0;
        Character charW='W';
        Boolean booleanW= false;

        int i = intW;//unboxing
        Integer intW2= Integer.parseInt("1");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));



    }
}
