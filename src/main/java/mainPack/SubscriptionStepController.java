package mainPack;
import files.FileHandling;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class SubscriptionStepController {
    @FXML
    private ToggleButton basicButton;

    @FXML
    private ToggleButton standardButton;

    @FXML
    private ToggleButton premiumButton;
    @FXML
    private ToggleGroup packageToggleGroup;
    @FXML
    public void initialize() {
        packageToggleGroup = new ToggleGroup();

        // Add buttons to the group
        basicButton.setToggleGroup(packageToggleGroup);
        standardButton.setToggleGroup(packageToggleGroup);
        premiumButton.setToggleGroup(packageToggleGroup);
    }

}
