package Content;

import javafx.scene.image.Image;

import java.util.*;

import Crew.Crew;
import Crew.CrewManager;


public abstract class Content {

    private List<Crew> castList;

    private String title;

    private String language;

    private String country;

    private Date releaseDate;

    private List<String> genres;

    private int id;

    private int budget;

    private int revenue;

    private float rating;

    private double duration;

    private Image poster;

    public Content(int id,String title,String language,String country,Date releaseDate){
        this.id = id;
        this.title = title;
        this.language = language;
        this.country = country;
        this.releaseDate = releaseDate;
        castList = new ArrayList<>();
    }

    public Content(int id,String title,String language,String country,Date releaseDate,int budget,int revenue,double duration,Image poster){
        this(id,title,language,country,releaseDate);
        this.budget = budget;
        this.revenue = revenue;
        this.duration = duration;
        this.poster = poster;
    }

    public List<Crew> getCastList() {
        return castList;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

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

    public float getRating() {
        return rating;
    }

    public void addGenres(String[] genre){
        Collections.addAll(genres, genre);
    }

    public void addCast(String firstName,String secondName) {
        Crew toAdd = CrewManager.Search(firstName,secondName);
        if(toAdd != null) {
            castList.add(toAdd);
            //toAdd.addWork(this);
        }
    }
}
// CONTENT CLASS
