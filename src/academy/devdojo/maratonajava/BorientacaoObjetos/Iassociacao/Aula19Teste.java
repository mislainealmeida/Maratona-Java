package academy.devdojo.maratonajava.BorientacaoObjetos.Iassociacao;

public class Aula19Teste {
    public static void main(String[] args) {
        Aula19Jogador jogador1 = new Aula19Jogador("Pelé");
        Aula19Jogador jogador2 = new Aula19Jogador("Romário");
        Aula19Jogador jogador3 = new Aula19Jogador("Cafu");

        //Aula19Jogador[] jogadores = new Aula19Jogador[]{jogador1,jogador2,jogador3};
         Aula19Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for (Aula19Jogador jogador: jogadores) {
            jogador.imprime();
        }
        System.out.println();


        System.out.println("**** Associação unidirecional(1 para N)****");
        Aula19Time time = new Aula19Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
        System.out.println();


    }
}
