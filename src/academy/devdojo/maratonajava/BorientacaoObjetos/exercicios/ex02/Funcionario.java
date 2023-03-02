package academy.devdojo.maratonajava.BorientacaoObjetos.exercicios.ex02;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (int i = 0; i < salarios.length; i++) {
                System.out.print(this.salarios[i] + " / ");
            }
            calcularMediaSalarios();
        }
    }

    public void calcularMediaSalarios() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia dos salários: " + media);

    }
}


