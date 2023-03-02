package academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.exception.teste;

import academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.exception.dominio.Aula30Leitor1;
import academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.exception.dominio.Aula30Leitor2;

import java.io.*;

public class Aula30TryWithResourcesTeste01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static  void lerArquivo(){
        try(Aula30Leitor1 leitor1= new Aula30Leitor1();
            Aula30Leitor2 leitor2= new Aula30Leitor2()){

        }catch(IOException e){

        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
