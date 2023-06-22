package academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = new Person.PersonBuilder()
                .firstName("Henrique")
                .lastName("Alves").build();

        ReportDto.ReportDtoBuilder reportDtoBuilder = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName());

        System.out.println(reportDtoBuilder);
    }
}
