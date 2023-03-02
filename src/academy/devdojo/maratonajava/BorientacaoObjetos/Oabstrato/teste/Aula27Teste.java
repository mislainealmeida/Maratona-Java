package academy.devdojo.maratonajava.BorientacaoObjetos.Oabstrato.teste;

import academy.devdojo.maratonajava.BorientacaoObjetos.Oabstrato.dominio.Aula27Desenvolvedor;
import academy.devdojo.maratonajava.BorientacaoObjetos.Oabstrato.dominio.Aula27Gerente;

public class Aula27Teste {
    public static void main(String[] args) {
        Aula27Gerente gerente = new Aula27Gerente("Nami", 5000);
        System.out.println(gerente);
        Aula27Desenvolvedor desenvolvedor= new Aula27Desenvolvedor("Touya", 12000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();


    }
}
