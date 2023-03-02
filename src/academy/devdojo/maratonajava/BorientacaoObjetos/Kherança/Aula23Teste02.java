package academy.devdojo.maratonajava.BorientacaoObjetos.Kherança;

public class Aula23Teste02 {
    //sequencia de inicialização
    //0-Bloco de inicialização estpatico da superclasse é executado quando a JVM carregar a classe pai.
    //1-Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha.
    //2-Alocado espaço de memória pro objeto da classe pai.
    //3-Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado da superclasse
    //4-Bloco de inicialização da superclasse é executado na ordem que aparece
    //5-Construtor da superclasse é executado
    //6-Alocado o espaço em memória da subclasse
    //7-Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado da subclasse
    //8-Bloco de inicialização da subclasse é executado na ordem que aparece
    //9-Construtor da subclasse é executado


    public static void main(String[] args) {
        Aula23Funcionario funcionario = new Aula23Funcionario("Joaquim");
    }

}
