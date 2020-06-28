package Aspect;

import Observadores.PanePrincipal;
import javafx.scene.paint.Color;

public aspect VerCambio {
    Color color;
    pointcut aviso() : call(* PanePrincipal.cambiarColor*(..) );
    
    after(): aviso(){
    	color = PanePrincipal.getColor();
    	System.out.println("*****El background ha sido cambiado a "+color+"*****");
    }

}
