package academy.devdojo.maratonajava.BorientacaoObjetos.Pinterfaces.dominio;

public class Aula28DataBaseLoader implements Aula28DataLoader, DateRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe");
    }
}
