package academy.devdojo.maratonajava.BorientacaoObjetos.Kherança;

public class Aula23Pessoa {
    protected String nome;
    protected String cpf;
    protected Aula23Endereco endereco;

    static{
        System.out.println("Dentro do bloco estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco  NÃO estático de pessoa 1");
    }

    {
        System.out.println("Dentro do bloco  NÃO estático de pessoa 2");
    }
    public Aula23Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Aula23Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+" "+this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Aula23Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Aula23Endereco endereco) {
        this.endereco = endereco;
    }

}
