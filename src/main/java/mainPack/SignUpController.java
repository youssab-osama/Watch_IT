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

    private void validateField(TextField field) {
        if (field.getText().isEmpty()) {
            field.setStyle("-fx-border-color: red; -fx-border-width: 2;");
            field.setPromptText("Field cannot be empty");
        } else {
            field.setStyle("");
        }
    }
    @FXML
    protected void OnButtonClick() throws IOException {
        validateField(username);
        validateField(email);
        validateField(password);
        validateField(firstName);
        validateField(lastName);
        if(username.getStyle().isEmpty() && email.getStyle().isEmpty() && password.getStyle().isEmpty() && firstName.getStyle().isEmpty() && lastName.getStyle().isEmpty()) {
            try {
                if(FileHandling.isWriterClosed) {
                    FileHandling.writer = new BufferedWriter(new FileWriter("src/main/java/files/usersData.txt",true));
                }
                FileHandling.writer.write(username.getText() + "," + email.getText() + "\n");
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
                Scene signUpScene = new Scene(fxmlLoader.load());
                Stage curStage = (Stage) signUpButton.getScene().getWindow();
                curStage.setScene(signUpScene);
                curStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                FileHandling.closeWriter();
                FileHandling.closeReader();
            }
        }

    }

    public void onSubmit(ActionEvent actionEvent) {
    }
}
