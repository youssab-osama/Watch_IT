package Crew;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes(value = {
        @JsonSubTypes.Type(value = Actor.class, name = "actor"),
        @JsonSubTypes.Type(value = Director.class, name = "director"),
        @JsonSubTypes.Type(value = Producer.class, name = "Producer")
})



public abstract class Crew {


    //personal details
    private String type;
    private String name;
    private String gender;
    private String nationality;
    private String dateOfBirth;


    //professional details
    private int crewID;
    private List<Integer> previousProjectsIDs = new ArrayList<>();
    //Constructor

    public Crew(){}

    public Crew(String type,String name, String gender, String dateOfBirth, String nationality, int crewID) {
        this.type = type;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        crewID = crewID;

    }

    //setters
    public void setName(String name) {

        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
        public void setPreviousProjects(List<Integer> previousProjects) {
        previousProjectsIDs = previousProjects;
    }

    //Getters

    public String getName() {

        return name;
    }

    public String getGender() {

        return gender;
    }

    public String getNationality() {

        return nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCrewID() {
        return crewID;
    }

    public  String getType(){
        return type;
    }

    public List<Integer> getPreviousProjects() {
        return previousProjectsIDs;
    }
    public void addContendID(int id){
        previousProjectsIDs.add(id);
    }



}
//show content
//filter movies
//show series
//show shows

