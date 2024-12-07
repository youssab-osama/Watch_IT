package mainPack;

import files.FileHandling;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SceneManager.init(stage,"LoginPage.fxml");
        FileHandling fileHandling = new FileHandling();
        FileHandling.closeWriter();
        FileHandling.closeReader();
    }

    public static void main(String[] args) {
        launch();
    }

}