package academy.devdojo.maratonajava.BorientacaoObjetos.Cmetodos;

public class Aula12Calculadora {
    public void somaArray(int[] numeros){
        int soma=0;
        for (int num: numeros) {
            soma +=num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma=0;
        for (int num: numeros) {
            soma +=num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs2(double valor, int... numeros){
        int soma=0;
        for (int num: numeros) {
            soma +=num;
        }
        System.out.println(soma);
    }
}
