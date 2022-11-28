package p5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button loginBtn;

    @FXML
    private PasswordField passwordTF;

    @FXML
    private Button signUpBtn;

    @FXML
    private TextField usernameTF;
    
    @FXML
    private Label errorLabel;

    @FXML
    void onLoginBtnClicked(ActionEvent event) throws IOException {
    	checkLogin(usernameTF.getText(),passwordTF.getText(),event);

    }

    @FXML
    void onSignUpBtnClicked(ActionEvent event) {
    	AppUtilities m = new AppUtilities();
    	m.changeScene("SignUp.fxml",event);
    }
    
    private void checkLogin(String username, String password, ActionEvent event) throws IOException {
    	AppUtilities m = new AppUtilities();
    	UserBase userbase = DataCenter.getInstance().getUserBase();
    	User user = userbase.getUserByCredentials(username, password);
 
    		if(user != null) {
    			DataCenter.getInstance().setLoggedInUser(user);
    			m.changeScene("Welcome.fxml", event);
    		}
    		else {
    			errorLabel.setText("Wrong login information");
    		}
    }

}
