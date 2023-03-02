package academy.devdojo.maratonajava.BorientacaoObjetos.Pinterfaces.teste;

import academy.devdojo.maratonajava.BorientacaoObjetos.Pinterfaces.dominio.Aula28DataBaseLoader;
import academy.devdojo.maratonajava.BorientacaoObjetos.Pinterfaces.dominio.Aula28DataLoader;
import academy.devdojo.maratonajava.BorientacaoObjetos.Pinterfaces.dominio.Aula28FileLoader;

public class Aula28Teste {
    public static void main(String[] args) {
        Aula28DataBaseLoader dataBaseLoader= new Aula28DataBaseLoader();
        Aula28FileLoader fileLoader = new Aula28FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        dataBaseLoader.remove();
        fileLoader.remove();
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
        dataBaseLoader.retrieveMaxDataSize();
        Aula28DataLoader.retrieveMaxDataSize();
    }
}
