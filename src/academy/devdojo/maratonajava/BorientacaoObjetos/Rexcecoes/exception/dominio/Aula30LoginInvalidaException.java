package academy.devdojo.maratonajava.BorientacaoObjetos.Rexcecoes.exception.dominio;

public class Aula30LoginInvalidaException extends Exception{
    public Aula30LoginInvalidaException() {
        super("Login inválido");
    }

    public Aula30LoginInvalidaException(String message) {
        super(message);
    }
}
