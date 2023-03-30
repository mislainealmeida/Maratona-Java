package academy.devdojo.maratonajava.CclassesUtilitarias.Gio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteTeste01 {
    public static void main(String[] args) {
        File file= new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw= new BufferedWriter(fw)) {

            bw.write("O devdojo é o melhor curso de Java");
            bw.newLine();
            bw.flush();

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
