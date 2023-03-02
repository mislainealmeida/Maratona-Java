package academy.devdojo.maratonajava.Aintroducao;

public class Aula03Operadores {
    public static void main(String[] args) {
        //Aritméticos, + - * /
        int numero1= 10;
        int numero2= 20;
        int  resultado = numero1+ numero2;
        double resultado2 = numero1 /(double) numero2;
        // o resultado de dois numeros inteiros sempre será inteiro,
        //pode ser feito um casting para obter um resultado double.

        System.out.println(numero2-numero1);
        System.out.println(resultado);
        System.out.println(resultado2);

        //% resto
        int resto = 20 % 2;
        System.out.println(resto);
        int resto1 = 21 % 2;
        System.out.println(resto1);
        System.out.println();

        //Relacionais < > <= >= == !=
        boolean isDezMaiorQueVinte= 10 > 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println();

        //Lógicos && || !
        int idade= 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinte = idade <30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinte);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca= 10000;
        double valorPlayStationCinco = 5000;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente >= valorPlayStationCinco || valorTotalContaPoupanca >= valorPlayStationCinco;
        System.out.println(isPlayStationCincoCompravel);

        //Atribuição = += -=  *= /= %=
        double bonus = 1800;
        bonus +=1000;
        System.out.println(bonus);
        bonus -=500;
        System.out.println(bonus);

        int contador=0;
        contador +=1;
        System.out.println(contador);

        int contador2= 0;
        System.out.println(contador2++);//executa primeiro e depois encrementa
        System.out.println(contador2);

        System.out.println(++contador2);//encrementa primeiro e depois executa
        System.out.println(contador2);





    }
}