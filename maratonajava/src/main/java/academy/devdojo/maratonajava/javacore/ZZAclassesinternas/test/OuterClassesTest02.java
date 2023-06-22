package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Henrique";

    static class Nested {
        private String lastName = "Alves";
        void print() {
            System.out.println(new OuterClassesTest02().name + " " +lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
