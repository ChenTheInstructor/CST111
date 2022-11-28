package p5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DemoP5 extends Application {

	private static Stage stg;

	public void start(Stage primaryStage) {
		try {
			stg = primaryStage;
			primaryStage.setResizable(true);
			Parent root = FXMLLoader.load(getClass().getResource("/p5/Login.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("GUI Project");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
    public void init() {
        DataCenter.getInstance();
    }
    @Override
    public void stop() throws Exception {
		DataCenter.getInstance().save();
        DataCenter.getInstance().setLoggedInUser(null);
    }

}
