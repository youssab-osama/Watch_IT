package mainPack;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneManager {
    public static Stage stage;
    public static Scene scene;

    public static void init(Stage stage, String fxml) throws IOException {
        SceneManager.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SceneManager.class.getResource(fxml));
        SceneManager.scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("WATCH IT");
        stage.setFullScreen(true);
        stage.show();
    }

    public static void switchScene(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SceneManager.class.getResource(fxml));
        SceneManager.scene.setRoot(fxmlLoader.load());
    }

    public static Stage getStage() {
        return stage;
    }
}
