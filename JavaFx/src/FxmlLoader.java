import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlLoader extends Application {
public static void main(String[] Args) {
	launch(Args);
}



	
	public void start(Stage primaryStage1) throws Exception {
		
		Parent root = FXMLLoader.load (getClass().getResource("main.fxml"));
		Scene scene = new Scene(root);
		 primaryStage1.setScene(scene);
		 primaryStage1.setTitle("Fxml Loading Apps");
		 primaryStage1.show();
		
	}

}
