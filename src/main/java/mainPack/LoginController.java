package mainPack;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import files.*;
import java.io.IOException;

public class LoginController {
    @FXML
    private Label welcomeText;

    @FXML
    TextField username = new TextField();
    @FXML
    TextField password = new TextField();

    @FXML
    Button signUpButton = new Button();

    private void validateField(TextField field) {
        if (field.getText().isEmpty()) {
            field.setStyle("-fx-border-color: red; -fx-border-width: 2;");
            field.setPromptText("Field cannot be empty");
        } else {
            field.setStyle("");
        }
    }

    @FXML
    protected void onSubmit() {
        // Retrieve text from the TextField
        String input = username.getText();
        System.out.println("User Input: " + input);
    }

    @FXML
    protected void OnButtonClick() throws IOException {
        validateField(username);
        validateField(password);
    }


    @FXML
    protected void onSignUp() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
            Scene signUpScene = new Scene(fxmlLoader.load());
            Stage curStage = (Stage) signUpButton.getScene().getWindow();
            curStage.setScene(signUpScene);
            curStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
