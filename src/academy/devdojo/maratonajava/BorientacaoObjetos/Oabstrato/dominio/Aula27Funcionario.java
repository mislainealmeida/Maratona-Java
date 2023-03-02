package academy.devdojo.maratonajava.BorientacaoObjetos.Oabstrato.dominio;

public abstract class Aula27Funcionario extends Aula27Pessoa{
    protected String nome;
    protected double salario;

    public Aula27Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    public abstract void calcularBonus();



}
