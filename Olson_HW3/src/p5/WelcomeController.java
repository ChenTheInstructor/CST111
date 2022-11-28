package p5;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class WelcomeController implements Initializable, Serializable {
	
	@FXML
    private TextArea newPostArea;

    @FXML
    private Button newsfeedBtn;

    @FXML
    private Button submitBtn;

    @FXML
    private Label welcomeLabel;

    @FXML
    void onNewsfeedBtnClicked(ActionEvent event) {
    	AppUtilities m = new AppUtilities();
		m.changeScene("NewsFeed.fxml", event);
    }

    @FXML
    void onSubmitBtnClicked(ActionEvent event) {
    	Post newLink = new Post(DataCenter.getInstance().getLoggedInUser(),newPostArea.getText());
    	DataCenter.getInstance().getLoggedInUser().getUserPosts().add(newLink);
    	DataCenter.getInstance().getNewsfeed().add(newLink);
    	newPostArea.clear();
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		welcomeLabel.setText("Welcome " + DataCenter.getInstance().getLoggedInUser().getUsername());
		newPostArea.clear();
		
	}

}


