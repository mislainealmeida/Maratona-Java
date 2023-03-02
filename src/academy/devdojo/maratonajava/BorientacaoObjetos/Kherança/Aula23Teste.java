package academy.devdojo.maratonajava.BorientacaoObjetos.Kherança;

public class Aula23Teste {
    public static void main(String[] args) {
        Aula23Endereco endereco = new Aula23Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("123456-000");

        Aula23Pessoa pessoa = new Aula23Pessoa("Mislaine");
        pessoa.setCpf("11111111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Aula23Funcionario funcionario = new Aula23Funcionario("Maria");
        System.out.println("------------------");

        funcionario.setCpf("22222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000.00);
        funcionario.imprime();




    }
}
