package principal;

import javafx.application.Application;
import javafx.stage.Stage;
import GUI.Ventana;
import Observadores.Observador;


public class Main extends Application{
    Observador ob = new Observador();
    @Override
    public void start(Stage stage)  {
        Ventana nuevaVentana= new Ventana(ob,stage);
        nuevaVentana.addObserver(ob);
        stage.setScene(nuevaVentana.getScene());
        stage.show();
    }
}
