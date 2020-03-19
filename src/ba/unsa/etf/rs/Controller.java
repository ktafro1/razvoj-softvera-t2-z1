package ba.unsa.etf.rs;


import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label helloWorld;
    public void reciHello(ActionEvent actionEvent){

        helloWorld.setText("Hello world!");
    }
}
