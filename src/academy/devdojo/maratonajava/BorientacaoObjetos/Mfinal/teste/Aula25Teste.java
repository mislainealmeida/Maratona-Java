package academy.devdojo.maratonajava.BorientacaoObjetos.Mfinal.teste;

import academy.devdojo.maratonajava.BorientacaoObjetos.Mfinal.dominio.Aula25Carro;

public class Aula25Teste {
    public static void main(String[] args) {
        Aula25Carro carro = new Aula25Carro();
        System.out.println(Aula25Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Maria");
        System.out.println(carro.COMPRADOR);

    }
}
