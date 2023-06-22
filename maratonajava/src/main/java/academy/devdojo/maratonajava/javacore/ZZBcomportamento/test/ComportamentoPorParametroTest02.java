package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> carList = List.of(new Car("green", 2011), new Car("Black", 1993));

    public static void main(String[] args) {
        List<Car> green = filter(carList, car -> car.getCor().equals("green"));
        System.out.println(green);

    }
    private static List<Car> filter(List<Car> carList, CarPredicate carPredicate){
        List<Car>filteredCar = new ArrayList<>();

        for (Car car:carList) {
            if (carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
