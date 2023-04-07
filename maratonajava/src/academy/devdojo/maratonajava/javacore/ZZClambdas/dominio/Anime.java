package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio;

public class Anime {
    private String title;
    private final int episodios;

    public Anime(String title, int quantity) {
        this.title = title;
        this.episodios = quantity;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodios() {
        return episodios;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + episodios +
                '}';
    }
}
