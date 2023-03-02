package academy.devdojo.maratonajava.BorientacaoObjetos.Dmodificadores;

public class Aula13Teste {
    public static void main(String[] args) {

        Aula13Pessoa pessoa = new Aula13Pessoa();
        pessoa.setNome("Ana");
        pessoa.setIdade(20);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
