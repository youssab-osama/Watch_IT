package Crew;

import java.util.*;

import Content.Content;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class CrewManager {
    public static ArrayList<Crew> crewList = new ArrayList<>();
    public static Crew Search(String name){
        Crew returnCrew = null;
        for(Crew crew : crewList){
            if(crew.getName().equals(name)) {
                returnCrew = crew;
                break;
            }
        }
        return returnCrew;
    }

    public static void addActor(String type,String firstName, String gender, String dateOfBirth, String nationality, int crewID){
        Crew crew = new Actor(type,firstName, gender, dateOfBirth, nationality, crewID);
        crewList.add(crew);
    }
    static void addDirector(String type,String firstName, String gender, String dateOfBirth, String nationality, int crewID,List<String> SocialMedia, List<String> genres){
        Crew crew = new Director(type ,firstName,  gender, dateOfBirth, nationality, crewID, SocialMedia);
        crewList.add(crew);
    }
    static void addProducer(String type,String firstName, String gender, String dateOfBirth, String nationality, int crewID,String productionCompany){
        Crew crew = new Producer(type ,firstName, gender, dateOfBirth, nationality, crewID, productionCompany);
        crewList.add(crew);
    }

    public static void displayCrewList(){
        for (Crew crew : crewList){
            System.out.println(crew.getName() + crew.getPreviousProjects());
        }
    }

    public Crew getCrewByID(int id){
        Crew returnCrew = null;
        for(Crew crew : crewList){
            if(crew.getCrewID() == id) {
                returnCrew = crew;
                break;
            }
        }
        return returnCrew;
    }

    public static void saveCrewListToJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(filePath), crewList);
    }

    // Load the Crew list from a JSON file
    public static void loadCrewListFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Crew> loadedcrewList = objectMapper.readValue(new File(filePath), objectMapper.getTypeFactory().constructCollectionType(List.class, Crew.class));
        crewList.addAll(loadedcrewList);
    }

}
// CREW MANAGER
