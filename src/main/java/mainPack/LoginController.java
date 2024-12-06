package mainPack;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class LoginController {
    @FXML
    private Label welcomeText;

    @FXML
    TextField username = new TextField();
    @FXML
    TextField password = new TextField();

    @FXML
    protected void onSubmit() {
        // Retrieve text from the TextField
        String input = username.getText();
        System.out.println("User Input: " + input);
    }

    @FXML
    protected void OnButtonClick() {
        String usernameText = username.getText();
        System.out.println("Username: " + usernameText);

        String passwordText = password.getText();
        System.out.println("User Password: " + passwordText);
    }



}
