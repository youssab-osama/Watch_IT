package mainPack;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {
    @FXML
    TextField email = new TextField();
    @FXML
    TextField password = new TextField();

    @FXML
    Button signUpButton = new Button();

    @FXML
    protected void onSubmit() {
        // Retrieve text from the TextField
        String input = email.getText();
        System.out.println("User Input: " + input);
    }

    @FXML
    protected void OnButtonClick() throws IOException {
        Validation.validateField(email);
        Validation.validateField(password);
    }

    @FXML
    protected void onSignUp() throws IOException {
        SceneManager.switchScene("SignUp.fxml");
    }



}
