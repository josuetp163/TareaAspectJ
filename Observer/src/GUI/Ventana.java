package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import Observadores.Observador;

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
        addButtons();
        scene = new Scene(root,600,600);
        stage.setScene(scene);

    }

    //Crea los botones y los agrega al layout
    private void addButtons() {
        VBox box = new VBox();
        Button buttonRed = new Button("Red");
        Button buttonBlue = new Button("Blue");
        Button buttonGreen = new Button("Green");
        buttonRed.setOnAction(e->ButtonPressed(buttonRed.getText()));
        buttonBlue.setOnAction(e-> ButtonPressed(buttonBlue.getText()));
        buttonGreen.setOnAction(e->ButtonPressed(buttonGreen.getText()));
        box.getChildren().addAll(buttonRed,buttonBlue,buttonGreen);
        root.getChildren().addAll(box);
    }

    /*Metodo que se aplica al presionar un botón. Notifica al observador para que cambie
    cambie el color del layout */
    private void ButtonPressed(String colorNuevo) {
        this.color=colorNuevo;
        setChanged();
        notifyObservers(color);
        System.out.println(obs.getLayoutColor());
        root.setStyle(obs.toString());
    }

    public StackPane getRoot() {
        return root;
    }

    public void setRoot(StackPane root) {
        this.root = root;
    }

    public Scene getScene() {
        return scene;
    }
}