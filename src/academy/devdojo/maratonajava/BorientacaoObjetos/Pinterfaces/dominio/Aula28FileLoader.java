package academy.devdojo.maratonajava.BorientacaoObjetos.Pinterfaces.dominio;

public class Aula28FileLoader implements Aula28DataLoader, DateRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no arquivo");
    }
}
