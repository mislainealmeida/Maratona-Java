package academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.runtime;

public class Aula30RuntimeExceptionTeste01 {
    public static void main(String[] args) {
        //Exception unchecked
        Object object = null;
        System.out.println(object.toString());

        int[] nums= {1,2};
        System.out.println(nums[2]);
    }
}
