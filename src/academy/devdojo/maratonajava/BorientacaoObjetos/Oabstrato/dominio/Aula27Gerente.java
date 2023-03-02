package academy.devdojo.maratonajava.BorientacaoObjetos.Oabstrato.dominio;

public class Aula27Gerente extends Aula27Funcionario{
    public Aula27Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Aula27Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
