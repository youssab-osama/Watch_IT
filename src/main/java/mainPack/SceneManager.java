package mainPack;
//class to control the flow of the program
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;


/*
* try {
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            MediaView mediaView = new MediaView(mediaPlayer);
            mediaPlayer.setOnError(() -> {
                System.err.println("Error: " + mediaPlayer.getError().getMessage());
            });
            mediaPlayer.setAutoPlay(true);
            Group root = new Group(mediaView);
            Scene scene = new Scene(root, 1920, 1080);
            stage.setScene(scene);
            stage.setTitle("Playing video");
            stage.show();
            mediaPlayer.setOnEndOfMedia(() -> {
                mediaPlayer.stop(); // Stop the media player
                try {
                    SceneManager.init(stage,"LoginPage.fxml"); // Set the next scene
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
* */


public class SceneManager {
    public static Stage stage;
    public static Scene scene;
    public static final String path = "C:/Users/peter/Downloads/WatchIT_intro.mp4";
    public static MediaView mediaView;
    public static Media media;
    public static MediaPlayer mediaPlayer;
    public static Group group;
    public static void init(Stage stage) throws IOException {
        SceneManager.stage = stage;
        SceneManager.media = new Media(new File(path).toURI().toString());
        SceneManager.mediaPlayer = new MediaPlayer(media);
        SceneManager.mediaView = new MediaView(mediaPlayer);
        SceneManager.mediaPlayer.setOnError(() -> {
            System.err.println("Error: " + mediaPlayer.getError().getMessage());
        });
        SceneManager.mediaPlayer.setAutoPlay(true);
        SceneManager.group = new Group(mediaView);
        SceneManager.scene = new Scene(group, 1920, 1080);
        SceneManager.stage.setScene(scene);
        SceneManager.stage.setFullScreen(true);
        SceneManager.stage.setFullScreenExitHint("");
        SceneManager.stage.setTitle("WATCH IT");
        SceneManager.stage.show();
        mediaPlayer.setOnEndOfMedia(() -> {
            mediaPlayer.stop(); // Stop the media player
            try {
                SceneManager.init(stage,"LoginPage.fxml"); // Set the next scene
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }


    public static void init(Stage stage, String fxml) throws IOException {
//        SceneManager.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SceneManager.class.getResource(fxml));
        SceneManager.switchScene("LoginPage.fxml");
//        stage.setScene(scene);
//        stage.setTitle("WATCH IT");
//        stage.setFullScreen(true);
//        stage.show();
    }

    public static void switchScene(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SceneManager.class.getResource(fxml));
        SceneManager.scene.setRoot(fxmlLoader.load());
    }

    public static Stage getStage() {
        return stage;
    }
}
