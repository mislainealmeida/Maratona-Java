package academy.devdojo.maratonajava.BorientacaoObjetos.Iassociacao;

public class Aula21Teste {
    public static void main(String[] args) {
        System.out.println("**** Associação bidirecional ****");

        Aula21Jogador jogador1= new Aula21Jogador("Cafu");
        Aula21Jogador jogador2= new Aula21Jogador("Pelé");
        Aula21Time time = new Aula21Time("Brasil");
        Aula21Jogador[] jogadores= {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);
        System.out.println();
        System.out.println("Jogador");
        jogador1.imprime();
        System.out.println();
        jogador2.imprime();

        System.out.println();
        System.out.println("Time");
        time.imprime();
    }
}
