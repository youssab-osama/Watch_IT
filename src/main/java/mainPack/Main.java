package mainPack;

import Content.ContentManager;
import Content.Movie;
import Crew.Actor;
import Crew.CrewManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        ContentManager contentManager = new ContentManager();
        CrewManager crewManager = new CrewManager();

        contentManager.addListOfMovies(new ArrayList<Movie>() {{
            add(new Movie(1, "Movie Title 1", "English", "USA", new Date(2023, 10, 5)));
            add(new Movie(2, "Movie Title 2", "Spanish", "Spain", new Date(2022, 6, 20)));
            add(new Movie(3, "Movie Title 3", "French", "France", new Date(2021, 11, 12)));
        }});

        CrewManager.addActor("John", "Doe", "Male", new Date(1990, 1, 15), "American", 101);
        CrewManager.addActor("Carlos", "Garcia", "Male", new Date(1992, 8, 30), "Spanish", 103);
        CrewManager.addActor("Jane", "Smith", "Female", new Date(1985, 5, 22), "British", 102);
        contentManager.addMovie(1, "Movie One", "English", "USA", new Date(2023, 10, 5),1000,100,60,null);
        Movie movie2 = new Movie(2, "Movie Two", "French", "France", new Date(2022, 6, 20),1000,100,60,null);
        Movie movie3 = new Movie(3, "Movie Three", "Spanish", "Spain", new Date(2021, 11, 12),1000,100,60,null);
        contentManager.addMovie(movie2);
        contentManager.addMovie(movie3);

        movie2.addCast("John","Doe");

        contentManager.DisplayNewReleases();
        launch();

    }
}