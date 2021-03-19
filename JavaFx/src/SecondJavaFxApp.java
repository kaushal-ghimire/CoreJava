import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SecondJavaFxApp extends Application{

	public static void main(String[] args) {
	launch(args);
FxmlLoader load = new FxmlLoader();
System.out.println(load);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Button btn = new Button("Click To Start");
		Button btn1 = new Button("Exit App");
		btn1.setOnAction(e->{
			System.out.println("Close Application...");
			System.exit(0);	
		});
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
			System.out.println("Start Application......");
				
			}
		});
		
		
		VBox layout = new VBox();
	
		layout.getChildren().addAll(btn,btn1);
		
		Scene scene = new Scene(layout,500,400);
		
		primaryStage.setTitle("JavaFx App: VBox Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
