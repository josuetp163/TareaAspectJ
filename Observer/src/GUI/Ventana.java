package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import Observadores.PanePrincipal;

public class Ventana {
    private Scene scene;
    private BorderPane root;
    private PanePrincipal pp;
    private FlowPane botones;
    private Button btn;
    
    private Stage stageBotones;
    private Scene sceneBotones;
    private VBox rootBotones;
    
    
    //Constructor
    public Ventana(Stage stage) {
    	crearEstructuraBotones();
        crearEstructura(stage);
        mostrarVentanaBotones();
        stage.setTitle("Aspectos");
        stage.setScene(scene);
        stage.show();
    }

    //Crea la escena, la ventana y los agrega junto con los botones
    private void crearEstructura(Stage stage) {
        root = new BorderPane();
        btn = new Button("Nuevo Botón");
        crearPanePrincipal();
        crearBotones();
        root.setCenter(pp);
        root.setBottom(botones);
        root.setRight(btn);
        root.setPadding(new Insets(10));
        scene = new Scene(root,600,600);
        stage.setScene(scene);
    }

    // Método encargado de crear los botones y colocarlos en un HBox
    private void crearBotones() {
    	botones = new FlowPane();
    	botones.setPadding(new Insets(10));
    	botones.setHgap(10.0);
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
    
    // Funcionalidad Nueva: Añadir nuevos botones
    private void crearEstructuraBotones() {
    	crearVentanaBotones();
    	sceneBotones = new Scene(rootBotones, 250, 250);
    	stageBotones = new Stage();
    	stageBotones.setScene(sceneBotones);
    }
    
    private void agregarBotones(String color) {
    	Boton btn = new Boton(color,pp);
    	botones.setPadding(new Insets(10));
    	botones.getChildren().addAll(btn.getButton());
    }
    
    private void crearVentanaBotones() {
    	rootBotones = new VBox();
    	TextField txt = new TextField("Ingrese un color");
    	Button btn = new Button("Agregar");
    	btn.setOnAction(e -> {
    		String color = txt.getText();
			try {
				Color c = Color.valueOf(color);
				if (c != null) {
					agregarBotones(color);
					stageBotones.close();
				}
				else {
					txt.setText("Ingrese un color válido");
				}
			}
			catch(IllegalArgumentException ex) {
				txt.setText("Ingrese un color válido");
			}
    	});
    	rootBotones.getChildren().addAll(txt,btn);
    }

    private void mostrarVentanaBotones() {
    	this.btn.setOnAction(e -> {
    		stageBotones.show();
    		stageBotones.setAlwaysOnTop(true);
    		stageBotones.centerOnScreen();
    	});
    }
}