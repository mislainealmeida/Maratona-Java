package academy.devdojo.maratonajava.Aintroducao;

public class Aula07ArraysMultidimensionais {
    public static void main(String[] args) {
        /*int [][] dias = new int[3][3];
        dias[0][0]=31;
        dias[0][1]=28;
        dias[0][2]=25;

        dias[1][0]=31;
        dias[1][1]=28;
        dias[1][2]=25;

        dias[2][0]=31;
        dias[2][1]=28;
        dias[2][2]=25;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);

            }

        }
        System.out.println("-------------------");

        for (int[] arrayBase: dias) {
            for (int num: arrayBase) {
                System.out.println(num);
            }
        }
        System.out.println("--------------------");*/

        /*int[][] arrayInt= new int[3][];
        arrayInt[0]= new int[2];
        arrayInt[1]= new int[3];
        arrayInt[2]= new int[6];

        for (int[] arrayBase: arrayInt) {
            System.out.println("\n-------------");
            for (int num: arrayBase) {
                System.out.print(num+" ");
            }
        }
         System.out.println("--------------------");*/

        int[] array= {1,2,3};
        int [][] arrayInt= new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        int[][] arrayInt2= {{0,0},{1,2,3},{1,2,3,4,5,6}};


        for (int[] arrayBase: arrayInt2) {
            System.out.println("\n-------------");
            for (int num: arrayBase) {
                System.out.print(num+" ");
            }
        }

    }
}
