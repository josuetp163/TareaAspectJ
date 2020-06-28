package principal;

import javafx.application.Application;
import javafx.stage.Stage;
import GUI.Ventana;


public class Main extends Application{
    @Override
    public void start(Stage stage)  {
        Ventana nuevaVentana= new Ventana(stage);
        stage.setScene(nuevaVentana.getScene());
        stage.show();
    }
    
    public static void main(String[] args) {
    	launch(args);
    }
}
