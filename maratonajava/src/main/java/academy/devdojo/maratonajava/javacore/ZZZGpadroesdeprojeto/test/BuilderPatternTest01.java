package academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .firstName("Henrique")
                .lastName("Alves")
                .username("Henrialves")
                .email("henriquealves_cavalcanti@hotmail.com")
                .build();

        System.out.println(person);
    }
}
