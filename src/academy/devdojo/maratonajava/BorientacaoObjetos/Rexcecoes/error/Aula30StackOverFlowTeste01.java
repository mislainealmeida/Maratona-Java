package academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.error;

public class Aula30StackOverFlowTeste01 {

    //Error
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
