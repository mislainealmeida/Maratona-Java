package academy.devdojo.maratonajava.BorientacaoObjetos.Iassociacao;

public class Aula20Teste {
    public static void main(String[] args) {
        System.out.println("**** Associação unidirecional(N para 1)****");
        System.out.println();

        Aula20Professor professor1 = new Aula20Professor("Jiraya Sensei");
        Aula20Professor professor2 = new Aula20Professor("Kakashi Sensei");
        Aula20Professor[] professores={professor1, professor2};
        Aula20Escola escola = new Aula20Escola("Konoha", professores);

        escola.imprime();
    }
}
