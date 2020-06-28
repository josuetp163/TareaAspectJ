package GUI;

import javafx.scene.control.Button;
import java.util.Observable;

public class Boton extends Observable {
    private Button btn;
    private String color="";


    //Constructor
    public Boton(String clr) {
    	//Instancia los botones
    	btn = new Button(clr);
        color = clr;           
        
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

