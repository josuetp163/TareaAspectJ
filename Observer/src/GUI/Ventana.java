package GUI;

import Observadores.Observador;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Observable;

public class Ventana extends Observable {
    Observador obs;
    private Scene scene;
    private StackPane root;
    private String color="";

    //Constructor
    public Ventana(Observador obs,Stage stage) {
        this.addObserver(obs);
        crearEstructura(stage);
        stage.setTitle("Aspectos");
        stage.setScene(scene);
        stage.show();

    }

    //Crea la escena, la ventana y los agrega junto con los botones
    private void crearEstructura(Stage stage) {
        root = new StackPane();
        root.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #dc143c, #661a33)");
        scene = new Scene(root,600,600);
        stage.setScene(scene);

    }

    public Scene getScene() {
        return scene;
    }
}