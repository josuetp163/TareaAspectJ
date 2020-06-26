package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ventana{

	private Scene scene;
	private StackPane root;
	
	public Ventana(Stage stage) {
		crearEstructura(stage);
		stage.setTitle("Aspectos");
		stage.setScene(scene);
		stage.show();
		
	}
	
	private void crearEstructura(Stage stage) {
		root = new StackPane();
		addButtons();
		scene = new Scene(root,600,600);	
		
	}
	private void addButtons() {
		VBox box = new VBox();
		Button buttonRed = new Button("Red");
		Button buttonBlue = new Button("Blue");
		Button buttonGreen = new Button("Green");
		box.getChildren().addAll(buttonRed,buttonBlue,buttonGreen);
		root.getChildren().addAll(box);
	}
}
