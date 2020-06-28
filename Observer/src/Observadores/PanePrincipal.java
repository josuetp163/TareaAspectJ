package Observadores;

import java.util.Observable;
import java.util.Observer;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class PanePrincipal extends StackPane implements Observer{

	private static Color color;
	
	// Método llamado cuando los observados notifican al observador
	@Override
	public void update(Observable arg0, Object arg1) {
		cambiarColor((String) arg1);
	}

	// Método encargado de cambiar el color del Pane
	private void cambiarColor(String color) {
		this.color = Color.valueOf(color);
		setBackground(new Background(new BackgroundFill(this.color, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static Color getColor() {
		return color;
	}
}
