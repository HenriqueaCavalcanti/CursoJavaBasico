package academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio;

public class Car {
        private String name = "Audi";
        private String cor;
        private int year;

    public Car(String cor, int year) {
        this.cor = cor;
        this.year = year;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cor='" + cor + '\'' +
                ", year=" + year +
                '}';
    }
}
