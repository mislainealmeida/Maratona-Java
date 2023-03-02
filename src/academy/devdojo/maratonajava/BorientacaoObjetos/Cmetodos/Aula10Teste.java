package academy.devdojo.maratonajava.BorientacaoObjetos.Cmetodos;

public class Aula10Teste {
    public static void main(String[] args) {
        Aula10Calculadora calculadora = new Aula10Calculadora();
        System.out.println("Métodos");
        calculadora.somarDoisNumeros();
        calculadora.subtrairDoisNumeros();
        System.out.println("--------------");

        System.out.println("Parâmetros");
        calculadora.multiplicarDoisNumeros(10,20);
        System.out.println("--------------");

        System.out.println("Retornos");
        double resultado = calculadora.dividirDoisNumeros(20,0);
        System.out.println(resultado);
        double resultado2 = calculadora.dividirDoisNumeros2(20,0);
        System.out.println(resultado2);
        double resultado3 = calculadora.dividirDoisNumeros3(20,0);
        System.out.println(resultado3);
        calculadora.imprimirDivisaoDoisNumeros3(86,5);
        //calculadora.imprimirDivisaoDoisNumeros3(86,0);//infinity
        System.out.println("--------------");

        System.out.println("Parâmetros: tipos primitivos");
        int num1 = 1;
        int num2= 2;
        Aula10Calculadora.alterarDoisNumeros(num1, num2);
        System.out.println("Dentro do Teste");
        System.out.println("Num1 = "+num1);
        System.out.println("Num2 = "+num2);



    }


}
