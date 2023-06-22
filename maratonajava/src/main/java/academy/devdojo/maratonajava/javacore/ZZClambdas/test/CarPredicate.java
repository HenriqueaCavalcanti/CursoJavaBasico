package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
//    anonimas, funções, conciso.
//    Pra poder utilizar lambdas é necessário ser uma interface funcional.
    boolean test(Car car);
//    (parametro) -> <expressão>
//    (Car car) -> car.getColor().equals("green");
}
