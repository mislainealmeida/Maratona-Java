package academy.devdojo.maratonajava.Hcomportamento.teste;

import academy.devdojo.maratonajava.Hcomportamento.dominio.Car;
import academy.devdojo.maratonajava.Hcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars= List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> yearBeforeYear = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(yearBeforeYear);


    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car: cars){
           if(carPredicate.test(car)){
               filteredCar.add(car);
           }
        }return filteredCar;
    }



}
