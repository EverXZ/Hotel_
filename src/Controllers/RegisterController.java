package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 * @author Jesús Hernández
 */
public class RegisterController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // registerButton.setOnAction(event -> registerUser());
    }
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField idField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button registerButton;
}