package p5;

import java.io.Serializable;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;


public class PostDisplayController implements Initializable, Serializable{

    @FXML
    private Label authorLabel;

    @FXML
    private TextArea displayedPost;
    
    @FXML
    private Button refreshBtn;

    @FXML
    private TextArea respomsePost;

    @FXML
    private ListView<Post> responseListView;

    @FXML
    private Button submitResponseBtn;
    
    ObservableList<Post> list = FXCollections.observableArrayList();

    @FXML
    void onSubmitResponseBtnClicked(ActionEvent event) {
    	Post newLink = new Post(DataCenter.getInstance().getLoggedInUser(),respomsePost.getText());
    	Post display = DataCenter.getInstance().getDisplayPost();
    	display.getResponseList().add(newLink);
    }
    
    @FXML
    void onRefreshBtnClicked(ActionEvent event) {
    	loadData();
    }
    
    private void loadData() {
		list.removeAll(list);
		list.addAll(DataCenter.getInstance().getDisplayPost().getResponseList());
		
		responseListView.getItems().addAll(list); 
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		authorLabel.setText("Author: " + DataCenter.getInstance().getDisplayPost().getAuthor().getUsername());
		displayedPost.setText(DataCenter.getInstance().getDisplayPost().getContent());
		displayedPost.setEditable(false);
		loadData();
		
		
	}

}
