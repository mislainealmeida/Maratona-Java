package academy.devdojo.maratonajava.BorientacaoObjetos.Oabstrato.dominio;

public class Aula27Desenvolvedor extends Aula27Funcionario{
    public Aula27Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Aula27Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
