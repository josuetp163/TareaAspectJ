package Aspect;

import Observadores.PanePrincipal;
import GUI.Ventana;

import javafx.scene.paint.Color;

public aspect VerCambio {
    String color;
    String boton;
    
    pointcut avisoColor() : call(* PanePrincipal.cambiarColor*(..) );
    pointcut avisoBoton() : call(* Ventana.agregarBotones*(..) );
    
    after(): avisoColor(){
    	color = PanePrincipal.getColor();
    	System.out.println("*****The brackground color has changed to "+color.toLowerCase()+"*****");
    }
    
    after(): avisoBoton(){
    	System.out.println("****Button has been created****");
    }
    
    

}
