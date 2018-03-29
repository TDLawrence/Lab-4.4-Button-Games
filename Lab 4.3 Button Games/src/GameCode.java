import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class GameCode extends Application {
	
	public static void main(String[] args) {
	        launch(args);
	}
		public void start(Stage primaryStage) 
		{   
			
			primaryStage.setTitle("Cool");
		    TextField name=new TextField();
		    name.setPromptText("Please enter your name");
		    name.setOnAction(new EventHandler<ActionEvent> ()
		    		{public void handle (ActionEvent initial)
		    	       {name.getCharacters();
		    	       }
		    	
		    		});
	        Button btn = new Button();
	        btn.setText("Ok");
	        btn.setOnAction(new EventHandler<ActionEvent>() 
	             {@Override
	               public void handle(ActionEvent event) 
	                  {System.out.println(" clicks");
	            	  }
	        	 });
		
	            
	            
	        StackPane root = new StackPane();
	        root.getChildren().add(btn);
	        primaryStage.setScene(new Scene(root, 350, 200));
	        primaryStage.show();
		    
	}
}
