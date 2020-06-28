package Aspect;

import javafx.scene.paint.Color;

public aspect VerCambio {
    Color color;
    pointcut aviso() : call(* PanePrincipal.cambiarColor*(..) );
    
    after(): aviso(){
    	color = PanePrincipal.color();
    	System.out.println("*****El background ha sido cambiado a "+color+"*****");
    }

}
