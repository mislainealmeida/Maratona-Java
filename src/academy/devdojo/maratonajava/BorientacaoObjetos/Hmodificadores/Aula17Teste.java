package academy.devdojo.maratonajava.BorientacaoObjetos.Hmodificadores;

public class Aula17Teste {
    public static void main(String[] args) {

        Aula17Carro carro1 = new Aula17Carro("BMW", 280);
        Aula17Carro carro2 = new Aula17Carro("Mercedes", 275);
        Aula17Carro carro3 = new Aula17Carro("Audi", 290);

        Aula17Carro.setVelocidadeLimite(180);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }

}
