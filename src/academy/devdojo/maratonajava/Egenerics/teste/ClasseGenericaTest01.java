package academy.devdojo.maratonajava.Egenerics.teste;

import academy.devdojo.maratonajava.Egenerics.dominio.Carro;
import academy.devdojo.maratonajava.Egenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService= new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);

    }
}
