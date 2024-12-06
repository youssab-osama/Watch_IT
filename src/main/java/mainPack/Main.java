package mainPack;

import files.FileHandling;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("LoginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        FileHandling fileHandling = new FileHandling();
        stage.setTitle("Hello!");
        stage.setScene(scene);
//        stage.setFullScreen(true);
        stage.show();
        FileHandling.closeWriter();
        FileHandling.closeReader();
        System.out.println("I'm Here");
    }

    public static void main(String[] args) {
        launch();
    }

}