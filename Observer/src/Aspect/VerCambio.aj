package Aspect;

import Observadores.PanePrincipal;
import javafx.scene.paint.Color;

public aspect VerCambio {
    String color;
    pointcut aviso() : call(* PanePrincipal.cambiarColor*(..) );
    
    after(): aviso(){
    	color = PanePrincipal.getColor();
    	System.out.println("*****The brackground color has changed to "+color.toLowerCase()+"*****");
    }

}
