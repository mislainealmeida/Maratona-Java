package academy.devdojo.maratonajava.Aintroducao.exercicios;

public class Ex03Condicionais {
    public static void main(String[] args) {
        int dia = 5;
        switch (dia){
            //case 2,3,4,5,6:// a partir da versão 14, é possível colocar vários case na mesma linha.
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Dia inválido");
        }

    }
}
