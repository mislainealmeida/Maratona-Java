package academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Aula30Leitor2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor 2");
    }
}
