package academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {

        bookSeat("1A");
        bookSeat("1B");

    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getInstance());
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getInstance();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
        System.out.println(AircraftSingletonEager.getInstance());
    }
}
