package p5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class AppUtilities {
	public AppUtilities() {
		
	}


	public void changeScene(String scene, ActionEvent event) {
    	try {
    		Parent root;
       		root = FXMLLoader.load(getClass().getResource("/p5/" + scene));
       		Scene mainScene = new Scene(root);
       		Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       		primaryStage.setScene(mainScene);
       
       		primaryStage.show();
    	} 	catch (IOException e) {
	   		e.printStackTrace();
   		}
	}
	
	public void changeScene(String scene, MouseEvent event) {
    	try {
    		Parent root;
       		root = FXMLLoader.load(getClass().getResource("/p5/" + scene));
       		Scene mainScene = new Scene(root);
       		Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       		primaryStage.setScene(mainScene);
       
       		primaryStage.show();
    	} 	catch (IOException e) {
	   		e.printStackTrace();
   		}
	}

}
