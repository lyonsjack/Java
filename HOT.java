package javafxchapter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HOT extends Application {

	public void start(Stage stage) throws Exception {
		//load the FXML file
		Parent parent = FXMLLoader.load(getClass().getResource("hot.fxml"));
		
		//build the scene graph
		Scene scene = new Scene(parent);
		
		//display window using scene graph
		stage.setTitle("Hands On Test");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		//launch application
		launch(args);
	}
	
}
