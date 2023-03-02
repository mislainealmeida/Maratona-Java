package academy.devdojo.maratonajava.BorientacaoObjetos.Kherança;

public class Aula23Funcionario extends Aula23Pessoa{
    private double salario;

    static{
        System.out.println("Dentro do bloco estático de funcionário");
    }
    {
        System.out.println("Dentro do bloco  NÃO estático de funcionário 1");
    }

    {
        System.out.println("Dentro do bloco  NÃO estático de funcionário 2");
    }
    public Aula23Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
