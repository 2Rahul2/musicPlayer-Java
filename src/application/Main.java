package application;
	
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
//		Group root = new Group();
		Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage stage = new Stage();
//		
//		Text text = new Text();
//		text.setText("hello world");
//		text.setX(50);
//		text.setY(50);
//		text.setFill(Color.LIMEGREEN);
//		
//		Line line = new Line();
//		line.setStartX(200);
//		line.setStartY(200);
//		line.setEndX(500);
//		line.setEndY(300);
//		
//		root.getChildren().add(text);
//		root.getChildren().add(line);		
		stage.setScene(scene);
		stage.show();
	}
}
