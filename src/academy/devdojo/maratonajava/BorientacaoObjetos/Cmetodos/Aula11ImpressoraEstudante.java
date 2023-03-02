package academy.devdojo.maratonajava.BorientacaoObjetos.Cmetodos;

public class Aula11ImpressoraEstudante {
    public void imprimir(Aula11Estudante estudante){
        System.out.println();

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println();
        estudante.nome= "Juliana";
    }
}
