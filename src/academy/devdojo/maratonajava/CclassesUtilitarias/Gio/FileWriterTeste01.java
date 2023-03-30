package academy.devdojo.maratonajava.CclassesUtilitarias.Gio;
//File
//File writer
//File reader
//Buffer writer
//Buffer reader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args) {

        File file= new File("file.txt");
        try(FileWriter fw= new FileWriter(file)){
            fw.write("O devdojo é o melhor curso de Java");
            fw.flush();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
