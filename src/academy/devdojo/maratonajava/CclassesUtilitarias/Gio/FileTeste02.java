package academy.devdojo.maratonajava.CclassesUtilitarias.Gio;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed= new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed= fileArquivoDiretorio.renameTo(fileRenamed);

        File diretorioRenamed= new File("pasta2");
        fileDiretorio.renameTo(diretorioRenamed);
        boolean isDiretorioRenomeado= fileArquivoDiretorio.renameTo(diretorioRenamed);
    }
}
