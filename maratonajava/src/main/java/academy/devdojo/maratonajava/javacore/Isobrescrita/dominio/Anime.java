package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
        private String anime;

    public Anime() {
    }

    public Anime(String anime) {
        this.anime = anime;
    }


    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

//    sobrescrevendo
    @Override
    public String toString() {
        return "Name: " + this.anime;
    }
}
