package academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.teste;

import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.repositorio.Aula30Repositorio;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.servico.Aula30RepositorioArquivo;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.servico.Aula30RepositorioBd;
import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.servico.Aula30RepositorioMemoria;


public class Aula30Teste {
    public static void main(String[] args) {
        Aula30Repositorio repositorio= new Aula30RepositorioArquivo();
        repositorio.salvar();
        Aula30Repositorio repositorio2= new Aula30RepositorioBd();
        repositorio2.salvar();
        Aula30Repositorio repositorio3= new Aula30RepositorioMemoria();
        repositorio3.salvar();

    }
}
