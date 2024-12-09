package mainPack;
import files.FileHandling;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SceneManager.init(stage);
        FileHandling fileHandling = new FileHandling();
        FileHandling.closeWriter();
        FileHandling.closeReader();
    }
    public static void main(String[] args) {
        launch();
    }

}