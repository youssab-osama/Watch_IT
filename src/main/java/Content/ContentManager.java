package Content;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContentManager {
    private List<Content> contentList;
    public ContentManager(){
        contentList = new ArrayList<>();
        loadContent();
    }

    public void loadContent(){
     //reads the data from the file and converts it to objects
    }
    public void addMovie(int id, String title, String language, String country, Date releaseDate, int budget, int revenue, double duration, Image poster)
    {
        Movie movie = new Movie(id,title,language, country, releaseDate
                                ,budget,  revenue,  duration, poster);
        contentList.add(movie);
    }
    public  void addMovie(Movie movie)
    {
        contentList.add(movie);
    }
    public void addListOfMovies(List<Movie> moviesList){
        contentList.addAll(moviesList);
    }
    // function top-rated sorts the list based on the rating
    public List<Content> getTopRatedContent(){
        List<Content> topRatedContent = new ArrayList<>(contentList);
        topRatedContent.sort(Comparator.comparingDouble(Content::getRating).reversed());
        return  topRatedContent;
    }
    public void DisplayNewReleases(){
        List<Content> contents = getNewReleasesContent();
        for (Content content : contents){
            System.out.println(content.getTitle());
        }
    }

    // function new releases sorts the list based on the release date
    public List<Content> getNewReleasesContent(){
        List<Content> newReleasedContent = new ArrayList<>(contentList);
        newReleasedContent.sort(Comparator.comparing(Content::getReleaseDate).reversed());
        return  newReleasedContent;
    }

    // function filter : Display movies that matches specific filters (The filters may be
    //based on rating, movie duration and language)

    //the based on rating one it will take an input of int(rating) and return anything that has
    // a rating higher than the one sent
    public List<Content> filterOnRating(float minRating){
        return contentList.stream().filter(content -> content.getRating() >=minRating).collect(Collectors.toList());
    }
    //for the movie duration it will be the same as the rating
    public List<Content> filterOnDuration(float minDuration){
        return contentList.stream().filter(content -> content.getDuration() >=minDuration).collect(Collectors.toList());
    }
    //the language one  will just return a list with the matching movies
    public List<Content> filterOnLanguage(String language){
        return contentList.stream().filter(content -> content.getLanguage().equalsIgnoreCase(language)).collect(Collectors.toList());
    }



    // The user can also search and display all movies by the genre of
    //movie. (cross over between the search and content manager will be handled later) :

    //for the suggestions of similar movies (more like this)
    //first I will sort/return a substring of movies based on the genres
    //then they will be sorted based on how many actors the 2 movies have in common

    //recommended movies based on user watch history will be handled with the Recommendation class


}

