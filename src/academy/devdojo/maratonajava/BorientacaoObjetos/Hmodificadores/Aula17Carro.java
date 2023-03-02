package academy.devdojo.maratonajava.BorientacaoObjetos.Hmodificadores;

public class Aula17Carro {
    String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Aula17Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Velocidade Máxima: "+ this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+ Aula17Carro.velocidadeLimite);
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Aula17Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
