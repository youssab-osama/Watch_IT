package mainPack;

import files.FileHandling;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SignUpController {

    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField username;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    Button signUpButton = new Button();

    @FXML
    protected void OnButtonClick() throws IOException {
        Boolean userValid = Validation.validateField(username);
        Boolean firstNameValid = Validation.validateField(firstName);
        Boolean lastNameValid = Validation.validateField(lastName);
        Boolean emailRequired = Validation.validateEmail(email);
        Boolean passwordRequired = Validation.validatePassword(password);
        if(userValid && firstNameValid && lastNameValid && emailRequired && passwordRequired) {
            try {
                if(FileHandling.isWriterClosed) {
                    FileHandling.writer = new BufferedWriter(new FileWriter("src/main/java/files/usersData.txt",true));
                }
                FileHandling.writer.write(username.getText() + "," + email.getText() + "\n");
                SceneManager.switchScene("LoginPage.fxml");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                FileHandling.closeWriter();
                FileHandling.closeReader();
            }
        }

    }

    @FXML
    protected void onSignIn() throws IOException {
        SceneManager.switchScene("LoginPage.fxml");
    }

    public void onSubmit(ActionEvent actionEvent) {
    }
}
