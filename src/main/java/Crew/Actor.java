package Crew;

import java.util.Date;
import java.util.List;

public class Actor extends Crew{
    List<String> socialMedia ;
    //constructor

    public Actor(String firstName, String lastName, String gender, Date dateOfBirth, String nationality, int crewID) {
        super(firstName, lastName, gender, dateOfBirth, nationality, crewID);
    }

    public Actor(String firstName, String lastName, String gender, Date dateOfBirth, String nationality, int crewID, List<String> socialMedia) {
        super(firstName, lastName, gender, dateOfBirth, nationality, crewID);
        this.socialMedia = socialMedia;
    }





}
