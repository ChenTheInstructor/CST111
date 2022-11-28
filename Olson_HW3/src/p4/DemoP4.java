package p4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DemoP4 extends Application {

	private static Stage stg;

	public void start(Stage primaryStage) {
		try {
			stg = primaryStage;
			primaryStage.setResizable(true);
			Parent root = FXMLLoader.load(getClass().getResource("/p4/SignUp.fxml"));
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

}
