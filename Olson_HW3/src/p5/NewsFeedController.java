package p5;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class NewsFeedController implements Initializable, Serializable {
	ObservableList<Post> list = FXCollections.observableArrayList();
	
	@FXML
    private Button backBtn;
	@FXML
    private ListView<Post> postList;
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		loadData();
		
	}
	
	private void loadData() {
		list.removeAll(list);
		list.addAll(DataCenter.getInstance().getNewsfeed());
		
		postList.getItems().addAll(list); 
	}
	
	@FXML
    void onBackBtnClicked(ActionEvent event) {
		
		AppUtilities m = new AppUtilities();
		m.changeScene("Welcome.fxml",event);
    }
	
	 @FXML
	    void onPostClicked(MouseEvent event) {
		  	Post clicked = new Post(postList.getSelectionModel().getSelectedItem().getAuthor(), postList.getSelectionModel().getSelectedItem().getContent());
		  	System.out.println();
		  	DataCenter.getInstance().setDisplayPost(clicked);
		 	AppUtilities m = new AppUtilities();
		 	m.changeScene("PostDisplay.fxml",event);
	    }

}
