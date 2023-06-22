package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> carList = List.of(new Car("green", 2011), new Car("Black", 1993));

    public static void main(String[] args) {

        System.out.println(filterCorCar(carList, "Black"));
        System.out.println(filterYearsCar(carList, 2000));

    }
    private static List<Car> filterCorCar(List<Car> carList, String cor){
        List<Car>CorCars = new ArrayList<>();

        for (Car car:carList) {
            if (car.getCor().equals(cor)){
                CorCars.add(car);
            }
        }
        return CorCars;
    }

    private static List<Car> filterYearsCar(List<Car> carList, int years){
        List<Car> YearsCars = new ArrayList<>();

        for (Car car:carList) {
            if (car.getYear() > years){
                YearsCars.add(car);
            }
        }
        return YearsCars;
    }
}
