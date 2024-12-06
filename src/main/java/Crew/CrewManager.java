package Crew;

import java.util.*;
public class CrewManager {
    static ArrayList<Crew> Cast = new ArrayList<>();
    public static Crew Search(String firstName, String secondName){
        Crew returnCrew = null;
        for(Crew crew : Cast){
            if(crew.getFirstName().equals(firstName) && crew.getLastName().equals(secondName)) {
                returnCrew = crew;
                break;
            }
        }
        return returnCrew;
    }

    public static void addActor(String firstName, String lastName, String gender, Date dateOfBirth, String nationality, int crewID){
        Crew crew = new Actor(firstName, lastName, gender, dateOfBirth, nationality, crewID);
        Cast.add(crew);
    }
    static void addDirector(String firstName, String lastName, String gender, Date dateOfBirth, String nationality, int crewID,List<String> SocialMedia, List<String> genres){
        Crew crew = new Director(firstName, lastName, gender, dateOfBirth, nationality, crewID, SocialMedia);
        Cast.add(crew);
    }
    static void addProducer(String firstName, String lastName, String gender, Date dateOfBirth, String nationality, int crewID,String productionCompany){
        Crew crew = new Producer(firstName, lastName, gender, dateOfBirth, nationality, crewID, productionCompany);
        Cast.add(crew);
    }
}
// CREW MANAGER
