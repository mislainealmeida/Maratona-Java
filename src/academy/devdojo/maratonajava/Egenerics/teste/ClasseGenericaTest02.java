package academy.devdojo.maratonajava.Egenerics.teste;

import academy.devdojo.maratonajava.Egenerics.dominio.Barco;
import academy.devdojo.maratonajava.Egenerics.service.BarcoRentavelService;


public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService= new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o carro por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);

    }
}
