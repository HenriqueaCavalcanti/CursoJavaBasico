package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shorP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'w';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shorW = 1;
        Integer intW = 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100.0;
        Character charW = 'w';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intw2 = Integer.parseInt("1");
        System.out.println(intw2);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLetterOrDigit('!'));
    }
}
