package academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.dominio;

public interface Currency {
    String getSymbol();
}

class Real implements Currency {

    @Override
    public String getSymbol() {
        return "R$";
    }
}

class Usdolar implements Currency {

    @Override
    public String getSymbol() {
        return "$";
    }
}
