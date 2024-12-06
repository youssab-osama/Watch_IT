package Crew;

import java.util.Date;
import java.util.List;

public abstract class Crew {
    //personal details
    private String firstName;
    private String lastName;
    private String gender;
    private String nationality;
    private Date dateOfBirth;


    //professional details
    private final int CrewID;
    //                                private List<> PreviousProjects;
    //Constructor


    public Crew(String firstName, String lastName, String gender, Date dateOfBirth, String nationality, int crewID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        CrewID = crewID;

    }

    //setters
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    //    public void setPreviousProjects(List<String> previousProjects) {
//        PreviousProjects = previousProjects;
//    }

    //Getters

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public String getGender() {

        return gender;
    }

    public String getNationality() {

        return nationality;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCrewID() {
        return CrewID;
    }



//    public List<String> getPreviousProjects() {
//
//        return PreviousProjects;
//    }



}
//show content
//filter movies
//show series
//show shows

