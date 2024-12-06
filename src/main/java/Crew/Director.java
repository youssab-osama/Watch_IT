package Crew;

import java.util.Date;
import java.util.List;

public class Director extends Crew {
    private List<String> Genres;
    //constructor

    public Director(String firstName, String lastName, String gender, Date dateOfBirth, String nationality, int crewID, List<String> genres) {
        super(firstName, lastName, gender, dateOfBirth, nationality, crewID);
        Genres = genres;
    }

    public void setGenres(List<String> genres) {
        Genres = genres;
    }

    public List<String> getGenres() {
        return Genres;
    }
}

