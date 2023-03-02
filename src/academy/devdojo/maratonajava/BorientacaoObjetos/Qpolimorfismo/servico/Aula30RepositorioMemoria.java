package academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.servico;

import academy.devdojo.maratonajava.BorientacaoObjetos.Qpolimorfismo.repositorio.Aula30Repositorio;

public class Aula30RepositorioMemoria implements Aula30Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memória");
    }
}
