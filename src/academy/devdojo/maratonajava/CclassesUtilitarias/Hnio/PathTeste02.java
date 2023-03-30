package academy.devdojo.maratonajava.CclassesUtilitarias.Hnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTeste02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath= Paths.get("pasta");
        if(Files.notExists(pastaPath)){
            Path pastaDiretorio= Files.createDirectories(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDiretorio= Files.createDirectories(subPastaPath);
        Path filePath= Paths.get(subPastaPath.toString(), "file.txt");
        if(Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);

    }
}
