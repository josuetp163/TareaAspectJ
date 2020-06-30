package GUI;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import java.util.Observable;

import Observadores.PanePrincipal;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class Boton extends Observable {
    private Button btn;
    private String color="";


    //Constructor
    public Boton(String clr,PanePrincipal pane) {
    	//Instancia los botones
        Tooltip tp= new Tooltip();          //muestra el color al pasar el ratón por encima
        tp.setText(clr);
    	btn = new Button();
    	btn.setPrefSize(50,10);             //establece el tamaño
        color = clr;
        btn.setBackground(new Background(new BackgroundFill(Color.valueOf(color), CornerRadii.EMPTY, Insets.EMPTY)));
        btn.setTooltip(tp);
        this.addObserver(pane);
        
        //Establece el metodo al clickear los botones
        btn.setOnAction(e->btnClicked());

    }

    /* Metodo que se ejecuta al clickear un botón. Cambia el color de acuerdo
     * al botón clickeado y notifica a los observadores*/
    private void btnClicked() {
        setChanged();
        notifyObservers(this.color.toUpperCase());
    }


    //getters
    public Button getButton() {
    	return btn;
    }

}

