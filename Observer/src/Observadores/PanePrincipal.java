package Observadores;

import java.util.Observable;
import java.util.Observer;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class PanePrincipal extends StackPane implements Observer{
	Label lb;
	private static String color;

	public PanePrincipal() {
		lb= new Label();
		lb.setScaleY(3);
		lb.setScaleX(3);
		this.getChildren().add(lb);
	}

	// Método llamado cuando los observados notifican al observador
	@Override
	public void update(Observable arg0, Object arg1) {
		cambiarColor((String) arg1);
	}

	// Método encargado de cambiar el color del Pane
	private void cambiarColor(String clr) {
		color = clr;
		lb.setText(clr);
		setBackground(new Background(new BackgroundFill(Color.valueOf(color), CornerRadii.EMPTY,new Insets(10))));
	}
	
	public static String getColor() {
		return color;
	}
}
