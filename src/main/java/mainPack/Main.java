package mainPack;

import Content.ContentManager;
import Content.Movie;
import Content.Show;
import Crew.Actor;
import Crew.CrewManager;
import Crew.Director;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

        try {
            crewManager.loadCrewListFromJson("src/main/java/mainPack/crew.json");
            System.out.println("attempted to read files ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            contentManager.loadContentListFromJson("src/main/java/mainPack/content.json");
            System.out.println("attempted to read files ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        crewManager.displayCrewList();
        contentManager.displayAllContent();


            launch();

    }
}