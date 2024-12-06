package Crew;

import java.util.Date;
import java.util.List;

public class Producer extends Crew
{
   private String ProductionCompany;
    //constructor
    public Producer(String firstName, String lastName, String gender, Date dateOfBirth, String nationality, int crewID,String productionCompany) {
        super(firstName, lastName, gender, dateOfBirth, nationality, crewID);
        ProductionCompany=productionCompany;
    }
}
