package academy.devdojo.maratonajava.Ilambdas.dominio;

public class Anime {
    private String title;
    private int episodes;

    public Anime(String title, int episodes){
        this.title = title;
        this.episodes = episodes;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public int getEpisodes() {
        return episodes;
    }
}
