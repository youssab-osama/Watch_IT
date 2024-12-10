package Content;

import javafx.scene.image.Image;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.time.LocalDate;
import java.util.Date;


public class Show extends Content {
    private int numberOfEpisodes;
    public Show(){
        super();
    }
    public Show(int id,String title, String language, String country, LocalDate releaseDate){
        super(id,title,language,country,releaseDate);

    }
    public Show(int id, String title, String language, String country, LocalDate releaseDate, int budget, int revenue, double duration, Image poster,int numberOfEpisodes) {
        super(id,title,language,country,releaseDate,budget,revenue,duration,poster);
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
}
