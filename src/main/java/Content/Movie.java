package Content;
import javafx.scene.image.Image;

import java.util.Date;

public class Movie extends Content{
    public Movie(int id,String title, String language, String country, Date releaseDate){
        super(id,title,language,country,releaseDate);
    }
    public Movie(int id, String title, String language, String country, Date releaseDate, int budget, int revenue, double duration, Image poster) {
        super(id,title,language,country,releaseDate,budget,revenue,duration,poster);
    }
}
// MOVIE
// Mafe4 feh haga
