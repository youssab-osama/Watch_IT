package Crew;

import java.util.Date;
import java.util.List;

public class Director extends Crew {
    private List<String> Genres;
    //constructor

    public Director(){
        super();
    }

    public Director(String type,String firstName, String gender, String dateOfBirth, String nationality, int crewID, List<String> genres) {
        super(type,firstName, gender, dateOfBirth, nationality, crewID);
        Genres = genres;
    }

    public void setGenres(List<String> genres) {
        Genres = genres;
    }

    public List<String> getGenres() {
        return Genres;
    }
}

