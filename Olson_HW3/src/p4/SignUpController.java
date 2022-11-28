package p4;

import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private Button displayBtn;

    @FXML
    private TextField firstNameTF;

    @FXML
    private TextField lastNameTF;
    
    @FXML
    private TextField gpaTF;

    @FXML
    private TextField phoneNumTF;

    @FXML
    private TextArea regStudTA;

    @FXML
    private Button signUpBtn;

    @FXML
    private Label statusLabel;

    @FXML
    private TextArea waitStudTA;
    
    Classroom clazz = Classroom.getInstance();
    
   // PriorityQueue<Student> waitList = clazz.getWaitList();

    @FXML
    void onDisplayBtnClicked(ActionEvent event) {
    	regStudTA.setText(clazz.displayStudents());
    	waitStudTA.setText(clazz.displayWaitList());
    
    }

    @FXML
    void onSignUpBtnClicked(ActionEvent event) throws IOException {
    	if(firstNameTF.getText().isEmpty() || lastNameTF.getText().isEmpty() || gpaTF.getText().isEmpty() || phoneNumTF.getText().isEmpty()) {
    		statusLabel.setText("Please make sure all fields are filled out.");
    	}
    	Student newStudent = new Student(firstNameTF.getText(), lastNameTF.getText(), Integer.valueOf(phoneNumTF.getText()), Double.valueOf(gpaTF.getText()));
    	clazz.addStudent(newStudent);
    	
    }
	
	
    

}


