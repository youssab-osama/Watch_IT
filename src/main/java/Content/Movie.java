package Content;
import javafx.scene.image.Image;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.time.LocalDate;
import java.util.Date;



public class Movie extends Content{
    public  Movie(){
        super();
    }
    public Movie(int id,String title, String language, String country, LocalDate releaseDate){
        super(id,title,language,country,releaseDate);
    }
    public Movie(int id, String title, String language, String country, LocalDate releaseDate, int budget, int revenue, double duration, Image poster) {
        super(id,title,language,country,releaseDate,budget,revenue,duration,poster);
    }
}
// MOVIE
// Mafe4 feh haga
