package TV_Shows_Assignment;

public class TVShow {
    public String name;
    public Integer episodeCount;
    public String genre;
    public TVShow(String name, Integer episodeCount, String genre) {
        this.name = name;
        this.episodeCount = episodeCount;
        this.genre = genre;
    }
    public String getName(){
        return this.name;
    }
    public Integer getEpisodeCount(){
        return this.episodeCount;
    }
    public String getGenre(){
        return this.genre;
    }
    public String toString() {
        return "The name of the show is "+getName()+" with "+getEpisodeCount()+" episode(s). The genre is "+getGenre();
    }
}
