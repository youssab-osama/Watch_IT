package mainPack;

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
        if(!field.getText().contains("@") || !field.getText().contains("."))
        {
            field.setStyle("-fx-border-color: red; -fx-border-width: 2;");
            field.clear();
            field.setPromptText("Please A Enter Valid Email Address");
        }
        else {
            field.setStyle("");
        }
        return (field.getStyle().isEmpty());
    }

    public static Boolean validatePassword(TextField field) {
        if(field.getText().length() < 8)
        {
            field.setStyle("-fx-border-color: red; -fx-border-width: 2;");
            field.clear();
            field.setPromptText("Please Enter A Password With Length At Least 8");
        }
        else {
            field.setStyle("");
        }
        return (field.getStyle().isEmpty());
    }
}
