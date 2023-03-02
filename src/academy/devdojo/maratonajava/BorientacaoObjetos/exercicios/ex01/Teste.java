package academy.devdojo.maratonajava.BorientacaoObjetos.exercicios.ex01;

public class Teste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2= new Carro();

        carro.nome= "Jeep";
        carro.modelo = "Compass";
        carro.ano= 2022;

        carro2.nome= "Jeep";
        carro2.modelo="Commander";
        carro2.ano= 2023;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println("---------------------");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }

}
