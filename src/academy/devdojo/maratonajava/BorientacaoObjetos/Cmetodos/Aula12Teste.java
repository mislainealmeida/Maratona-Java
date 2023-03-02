package academy.devdojo.maratonajava.BorientacaoObjetos.Cmetodos;

public class Aula12Teste {
    public static void main(String... args) {
        Aula12Calculadora calculadora = new Aula12Calculadora();
        int[] numeros={1,2,3,4,5};
        calculadora.somaArray(numeros);

        System.out.println("Varargs");
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8);
        calculadora.somaVarArgs2(1,2,3,4,5,6,7,8);
    }
}
