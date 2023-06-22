package academy.devdojo.maratonajava.javacore.ZZZGpadroesdeprojeto.test;



public class TestCoordenadas {
    public static void main(String[] args) {


        Coordenada coordenada = new Coordenada();
        coordenada.setX(-2);
        coordenada.setY(3);

        Coordenada coordenada2 = new Coordenada();
        coordenada2.setX(-5);
        coordenada2.setY(-9);

        String ponto1 = coordenada.verificandoExistenciaDosPontos(3, 3);
        System.out.println(ponto1);

        System.out.println();

        Integer distancia = coordenada.distanciaEntreDoisPontos(coordenada, coordenada2);
        System.out.println(distancia);

    }
}

 class Coordenada {
    private int x, y;

    public Coordenada() {
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String verificandoExistenciaDosPontos(int x, int y){
        if (this.x == x && this.y == y){
            return  "Coordenadas existentes " + x + ", " + y;
        }
        return "Coordenadas novas: " + x + ", " + y;
    }

    public Integer distanciaEntreDoisPontos(Coordenada coordenada1, Coordenada coordenada2){
        double distancia = Math.sqrt(Math.pow(coordenada2.x - coordenada1.x, 2) + Math.pow(coordenada2.y - coordenada1.y, 2));
        return (int) distancia;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
