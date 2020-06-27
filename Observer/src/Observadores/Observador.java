package Observadores;

import java.util.Observable;
import java.util.Observer;

public class Observador implements Observer {

    private String layoutColor;

    public Observador() {
        this.layoutColor="";
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg.equals("RED")){
            this.layoutColor="-fx-background-color: #ff0000";
        }else if(arg.equals("BLUE")){
            this.layoutColor="-fx-background-color: #0000ff";
        }else if(arg.equals("GREEN")){
            this.layoutColor="-fx-background-color: #00ff00";
        }
    }



    public String getLayoutColor() {
        return layoutColor;
    }

    public void setLayoutColor(String layoutColor) {
        this.layoutColor = layoutColor;
    }

    @Override
    public String toString() {
        return  layoutColor;
    }
}
