package mainPack;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class LoginController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void OnSubmit(String value) {
        System.out.println("this is: "+value);
    }
    @FXML
    protected void OnButtonClick() {
        System.out.println("Welcome to JavaFX Application!");
    }



}
