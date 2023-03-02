package academy.devdojo.maratonajava.BorientacaoObjetos.Pinterfaces.dominio;

public interface Aula28DataLoader {
   // public static final int MAX_DATA_SIZE=10;
    int MAX_DATA_SIZE=10;
    //public abstract void load();
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }

}
