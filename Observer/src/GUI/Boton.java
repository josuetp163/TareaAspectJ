package GUI;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import java.util.HashMap;
import java.util.Observable;

public class Boton extends Observable {
    private HashMap <String,String> mapColores;
    private VBox vbBotones=new VBox();
    private Button btnRed;
    private Button btnBlue;
    private Button btnGreen;
    private String colorSelect="";

    //Constructor
    public Boton() {
        establecerColores();                //crea el mapa de colores con su similar en hexadecimal Color

        //Instancia los botones
        this.btnRed=new Button("Red");
        this.btnBlue=new Button("Blue");
        this.btnGreen=new Button("Green");

        //Establece el metodo al clickear los botones
        btnRed.setOnAction(e->btnClicked(btnRed.getText()));
        btnBlue.setOnAction(e->btnClicked(btnBlue.getText()));
        btnGreen.setOnAction(e->btnClicked(btnGreen.getText()));

        //agrega al vbox los botones
        vbBotones.getChildren().addAll(btnRed,btnGreen,btnGreen);
    }

    /* Metodo que se ejecuta al clickear un botón. Cambia el color de acuerdo
     * al botón clickeado y notifica a los observadores*/
    private void btnClicked(String color) {
        changeColor(color);
        setChanged();
        notifyObservers(color);
    }

    //Crea un mapa de colores para pasarle directamente el string del color
    private void establecerColores(){
        mapColores.put("Red","#ff0000");
        mapColores.put("Green","#00ff00");
        mapColores.put("Blue","#0000ff");
    }

    //Cambia el color según el string que le mande. Busca en el mapa si el color está
    private void changeColor(String color){
        if(mapColores.containsKey(color)){
            colorSelect=mapColores.get(color);
        }
    }

    //getters
    public VBox getVbBotones() {
        return vbBotones;
    }

}

