package Crew;

import java.util.Date;
import java.util.List;

public class Actor extends Crew{
    List<String> socialMedia ;
    //constructor
    public Actor(){
        super();
    }

    public Actor(String type , String firstName, String gender, String dateOfBirth, String nationality, int crewID) {
        super(type, firstName, gender, dateOfBirth, nationality, crewID);
    }

    public Actor(String type,String firstName, String gender, String dateOfBirth, String nationality, int crewID, List<String> socialMedia) {
        super(type, firstName,  gender, dateOfBirth, nationality, crewID);
        this.socialMedia = socialMedia;
    }





}
