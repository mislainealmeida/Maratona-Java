package academy.devdojo.maratonajava.Aintroducao;

public class Aula06Arrays {
    public static void main(String[] args) {

        String [] nomes= new String[3];
        nomes[0] = "Mislaine";
        nomes[1] = "Larissa";
        nomes[2] = "Juliana";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
        System.out.println();
        System.out.println("------------------");

        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3= new int[]{1,2,3,4,5};

       /*for (int i = 0; i < numeros3.length; i++) {

            System.out.println(numeros3[i]);
        }*/
        
        for (int num:numeros3) {
            System.out.println(num);
        }
    }
}
