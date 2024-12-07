package mainPack;
import java.util.regex.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

public class Validation {
    public static Boolean validateField(TextField field) {

        if (field.getText().isEmpty()) {

            field.setStyle("-fx-border-color: red; -fx-border-width: 2;");

            field.setPromptText("Field cannot be empty");
        }
        else {
            field.setStyle("");
        }
        return (field.getStyle().isEmpty());
    }

    public static Boolean validateEmail(TextField field) {
        String email = field.getText();

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()) {
            field.setStyle("");
        }
        else {
            field.setStyle("-fx-border-color: red; -fx-border-width: 2;");

            field.clear();

            field.setPromptText("Please Enter A Valid Email Address");
        }
        return matcher.matches();
    }

    public static Boolean validatePassword(TextField field) {
        String password = field.getText();

        String passwordRegex = "^.{8,}$";

        Pattern pattern = Pattern.compile(passwordRegex);

        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            field.setStyle("");
        }
        else {
            field.setStyle("-fx-border-color: red; -fx-border-width: 2;");

            field.clear();

            field.setPromptText("Please Enter A Password With Length At Least 8");
        }
        return matcher.matches();
    }
}
