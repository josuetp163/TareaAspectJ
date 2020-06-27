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

	private Color color;
	
	@Override
	public void update(Observable arg0, Object arg1) {
		cambiarColor((Color) arg1);
	}
	
	public void cambiarColor(Color c) {
		this.color = c;
		setBackground(new Background(new BackgroundFill(c, CornerRadii.EMPTY, Insets.EMPTY)));
	}
}
