package academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        bookSeat("1A");
        bookSeat("1A");

        System.out.println(AircraftSingletonLazy.getInstance());

//        Não deve se fazer isso abaixo.
        Constructor<AircraftSingletonLazy> Constructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        Constructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = Constructor.newInstance("787-900");
        System.out.println(aircraftSingletonLazy);
//

    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonLazy.getInstance());
        AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getInstance();
        System.out.println(aircraftSingletonLazy.bookSeat(seat));

    }
}
