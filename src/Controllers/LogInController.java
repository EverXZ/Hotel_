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
public class LogInController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    @FXML
    private TextField emailField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button registerButton;
}
