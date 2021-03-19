import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstJavaFxApp extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	 public void start(Stage stage1) {
		 Button btn = new Button("On Click");
		 btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
			System.out.println("Start App.....");
				
			}
		});
		 
		 StackPane stack = new StackPane();
		 stack.getChildren().add(btn);
		 
		 Scene scene = new Scene(stack,600,500);
		 
		 stage1.setTitle("JavaFx App");
		 stage1.setScene(scene);
		 stage1.show();
		 
	
	}

}
