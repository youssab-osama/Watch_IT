package Content;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javafx.scene.image.Image;

import java.time.LocalDate;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;

import java.io.File;
import java.io.IOException;

import Crew.Crew;
import Crew.CrewManager;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes(value = {
        @JsonSubTypes.Type(value = Movie.class, name = "movie"),
        @JsonSubTypes.Type(value = Show.class, name = "show")
})

public abstract class Content {
    private List<Integer> castIDs;
    public String type;
    private String title;

    public void setType(String type) {
        this.type = type;
    }

    private String language;

    private String country;

    @JsonIgnore
    //private LocalDate releaseDate;

    private  String initDate;

    private List<String> genres = new ArrayList<>();

    private int id;

    private int budget;

    private int revenue;

    private double rating;

    private int totalPeopleRated;

    private double duration;

    @JsonIgnore
    private Image poster;

    public Content(){
        castIDs = new ArrayList<>();
    }
    public Content(int id,String title,String language,String country,LocalDate releaseDate){
        this.id = id;
        this.title = title;
        this.language = language;
        this.country = country;
        //this.releaseDate = releaseDate;
        castIDs = new ArrayList<>();
    }

    public Content(int id,String title,String language,String country,LocalDate releaseDate,int budget,int revenue,double duration,Image poster){
        this(id,title,language,country,releaseDate);
        this.budget = budget;
        this.revenue = revenue;
        this.duration = duration;
        initDate = releaseDate.toString();
        //this.poster = poster;
    }

    public List<Integer> getCastList() {
        return castIDs;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    public void rateContent(double rate){
        rating *= totalPeopleRated;
        rating += rate;
        totalPeopleRated++;
        rating /= totalPeopleRated;
    }
//    public LocalDate getReleaseDate() {
//        return releaseDate;
//    }

    public List<String> getGenres() {
        return genres;
    }

    public int getId() {
        return id;
    }

    public int getBudget() {
        return budget;
    }

    public int getRevenue() {
        return revenue;
    }

    public double getDuration() {
        return duration;
    }

    public Image getPoster() {
        return poster;
    }

    public double getRating() {
        return rating;
    }

    public void addGenres(String[] genre){
        Collections.addAll(genres, genre);
    }

    public void addCast(String name) {
        Crew toAdd = CrewManager.Search(name);
        if(toAdd != null) {
            castIDs.add(toAdd.getCrewID());
            toAdd.addContendID(this.id);
        }
    }



}

// CONTENT CLASS
