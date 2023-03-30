package academy.devdojo.maratonajava.Egenerics.service;

import academy.devdojo.maratonajava.Egenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis= new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro disponível....");
        Carro carro= carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro: "+carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }

}
