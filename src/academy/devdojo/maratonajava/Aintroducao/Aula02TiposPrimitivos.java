package academy.devdojo.maratonajava.Aintroducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {


        int idade=10;
        long numeroGrande= 100000;
        double salarioDouble= 2000.0;
        float salarioFloat= 2500.0F;
        byte idadeByte= 127;
        short idadeShort= 32000;
        boolean verdadeiro= true;
        char caractere= 65; //char caractere= 'A';
        System.out.println("Aidade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println("char "+caractere); //traduz para a tabela ASCII


        //casting
        int idad= (int)10000000000L;
        System.out.println(idad);


        //String
        String nome= "Meu nome é Mislaine";
        System.out.println(nome);
        String nome2= "Mislaine";
        System.out.println("Meu nome é "+nome2);
        //var nome3= "Vegeta";//omitir o tipo da variável, a partir do java 10.



    }



}
