package academy.devdojo.maratonajava.BorientacaoObjetos.Cmetodos;


public class Aula10Calculadora {
    public void somarDoisNumeros() {
        System.out.println(10 + 10);
        System.out.println("Testando");
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicarDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividirDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double dividirDoisNumeros2(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public double dividirDoisNumeros3(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimirDivisaoDoisNumeros3(double num1, double num2) {
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;//break; 
        }
        System.out.println(num1/num2);
    }

    //Parametros: tipos primitivos
    public static void alterarDoisNumeros(int numero1, int numero2){
        numero1= 99;
        numero2= 33;
        System.out.println("Dentro do alterarDoisNumeros");
        System.out.println("Num1 = "+numero1);
        System.out.println("Num2 = "+numero2);
    }

}


