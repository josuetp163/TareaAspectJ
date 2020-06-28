package GUI;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


import Observadores.PanePrincipal;

public class Ventana {
    private Scene scene;
    private BorderPane root;
    private PanePrincipal pp;
    private HBox botones;

    //Constructor
    public Ventana(Stage stage) {
        crearEstructura(stage);
        stage.setTitle("Aspectos");
        stage.setScene(scene);
        stage.show();
    }

    //Crea la escena, la ventana y los agrega junto con los botones
    private void crearEstructura(Stage stage) {
        root = new BorderPane();
        crearPanePrincipal();
        crearBotones();
        root.setCenter(pp);
        root.setBottom(botones);
        scene = new Scene(root,600,600);
        stage.setScene(scene);
    }

    // Método encargado de crear los botones y colocarlos en un HBox
    private void crearBotones() {
    	botones = new HBox();
    	Boton bt1 = new Boton("blue",pp);
    	Boton bt2 = new Boton("yellow",pp);
    	Boton bt3 = new Boton("green",pp);
    	botones.getChildren().addAll(bt1.getButton(),bt2.getButton(),bt3.getButton());
    }
    
    // Método encargado de crear el PanePrincipal
    private void crearPanePrincipal() {
    	pp = new PanePrincipal();
    }
    
    public Scene getScene() {
        return scene;
    }
}