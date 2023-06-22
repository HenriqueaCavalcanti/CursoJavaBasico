package academy.devdojo.maratonajava.javacore.Cblocosinicializacao.dominio;

public class Anime {
    private String name;
    private int[] episodios;
// 1 - Alocado espaço em memória pra objeto.
// 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado.
// 3 - Bloco de inicialização é executado.
// 4 - Contrutor é executado.

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.print(episodios[i] + " ");
        }
        System.out.println();
    }

    public String getName(){
        return name;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
