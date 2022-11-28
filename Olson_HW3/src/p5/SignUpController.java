package p5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {
	@FXML
	private PasswordField confirmPassword;
	   
    @FXML
    private Button exitBtn;

    @FXML
    private Label invalidSignUp;

    @FXML
    private PasswordField newPasswordTF;

    @FXML
    private TextField newUserTF;

    @FXML
    private Button signUpBtn;

    @FXML
    void onExitBtnClicked(ActionEvent event) throws IOException {
    	AppUtilities m = new AppUtilities();
    	m.changeScene("Login.fxml", event);
    }

    @FXML
    void onSignUpBtnClicked(ActionEvent event) throws IOException {
    	if(newUserTF.getText().isEmpty() || newPasswordTF.getText().isEmpty()) {
    		invalidSignUp.setText("Please enter username and/or password to proceed.");
    	}
    	if (validateSignUp(newUserTF.getText(),newPasswordTF.getText())) {
    		User user = new User(newUserTF.getText(),newPasswordTF.getText());
    		DataCenter.getInstance().getUserBase().addUser(user);
    		System.out.println(DataCenter.getInstance().getUserBase());
    		AppUtilities m = new AppUtilities();
    		m.changeScene("Login.fxml", event);
    	}
    }
    
    private boolean validateSignUp (String newUser, String newPassword) throws IOException {
    	UserBase userbase = DataCenter.getInstance().getUserBase();
    	User user = userbase.getUserByUsername(newUser);
    		if(newPasswordTF.getText().isEmpty() || newUserTF.getText().isEmpty() || confirmPassword.getText().isEmpty()) {
    			invalidSignUp.setText("Please fill out all of the required fields.");
    			return false;
    		}
    		if((!confirmPassword.getText().equals(newPasswordTF.getText()))) {
    			invalidSignUp.setText("Please confirm your password.");
    			return false;
    		}
    		if(newPassword.length() < 6) {
    			invalidSignUp.setText("Password requirements not met. Please try again.");
    			return false;
    		}
 
    		if(user != null) {
    			invalidSignUp.setText("Username unavailable. Please choose a different username.");
    			return false;
    		}
    		
    		if(newUser.length() < 5) {
    			invalidSignUp.setText("Username requirements not met. Please try again.");
    			return false;
    		}
    		
    		
    		
    		return true;
    }

}
