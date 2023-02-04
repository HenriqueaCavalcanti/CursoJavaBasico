package academy.devdojo.maratonajava.javacore.Dsobrecargametodos.dominio;

public class Anime {
    private String name;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;


    public Anime(String tipo, int episodios, String name, String genero) {
        this.tipo = tipo;
        this.episodios = episodios;
        this.name = name;
        this.genero = genero;
    }
    public Anime(String tipo, int episodios, String name, String genero, String estudio) {
        this(tipo, episodios, name, genero);
        this.estudio = estudio;
    }


//    public void init(String tipo, int episodios, String name) {
//        this.tipo = tipo;
//        this.episodios = episodios;
//        this.name = name;
//    }
//
//    public void init(String tipo, int episodios, String name, String genero) {
//        this.init(tipo, episodios, name);
//        this.genero = genero;
//    }

    public void imprimi() {
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
