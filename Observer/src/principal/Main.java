package principal;

import GUI.Ventana;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	public static Scene scene;
	public static Ventana ventana;

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		ventana = new Ventana(primaryStage);
	}

	public static void main(String[] args) {
		launch(args);
	}




	
}
