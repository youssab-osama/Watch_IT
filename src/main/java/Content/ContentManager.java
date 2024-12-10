package Content;

import com.fasterxml.jackson.databind.ObjectMapper;

import javafx.scene.image.Image;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class ContentManager {
    private List<Content> contentList;
    public ContentManager(){
        contentList = new ArrayList<>();
        loadContent();
    }

    public void loadContent(){
     //reads the data from the file and converts it to objects
    }
    public void addContent(int id, String title, String language, String country, LocalDate releaseDate, int budget, int revenue, double duration, Image poster)
    {
        Movie movie = new Movie(id,title,language, country, releaseDate
                                ,budget,  revenue,  duration, poster);
        contentList.add(movie);

    }
    public  void addContent(Content content)
    {
        contentList.add(content);
    }
    public void addListOfMovies(List<Movie> moviesList){
        contentList.addAll(moviesList);
    }

    public Content getContentByTitle(String title)
    {
        for (Content content : contentList){
            if(content.getTitle().equalsIgnoreCase(title)){
                return content;
            }
        }
        return  null;
    }
    // function top-rated sorts the list based on the rating
    public List<Content> getTopRatedContent(){
        List<Content> topRatedContent = new ArrayList<>(contentList);
        topRatedContent.sort(Comparator.comparingDouble(Content::getRating).reversed());
        return  topRatedContent;
    }
    public void displayNewReleases(){
        List<Content> contents = getNewReleasesContent();
        for (Content content : contents){
            System.out.println(content.getTitle());
        }
    }

    public void displayAllContent(){
        for (Content content : contentList){
            System.out.println(content.getTitle()+content.getCastList());
        }
    }

    // function new releases sorts the list based on the release date
    public List<Content> getNewReleasesContent(){
        List<Content> newReleasedContent = new ArrayList<>(contentList);
        //newReleasedContent.sort(Comparator.comparing(Content::getReleaseDate).reversed());
        return  newReleasedContent;
    }

    // function filter : Display movies that matches specific filters (The filters may be
    //based on rating, movie duration and language)

    public List<Content> filterOnRating(float minRating){
        return contentList.stream().filter(content -> content.getRating() >=minRating).collect(Collectors.toList());
    }
    public List<Content> filterOnDuration(float minDuration){
        return contentList.stream().filter(content -> content.getDuration() >=minDuration).collect(Collectors.toList());
    }
    public List<Content> filterOnLanguage(String language){
        return contentList.stream().filter(content -> content.getLanguage().equalsIgnoreCase(language)).collect(Collectors.toList());
    }


    // Save all content objects to a file
    public void saveContentListToJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(filePath), contentList);
    }

    // Load all content objects from a file
    public void loadContentListFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        // Ensure that Jackson knows about the polymorphic types (Movie, Show, etc.)
        List<Content> loadedContentList = objectMapper.readValue(new File(filePath),
                objectMapper.getTypeFactory().constructCollectionType(List.class, Content.class));
        contentList.addAll(loadedContentList);
    }



    //how to get trending movies
    //we need to store each view and it's date
    //
}



