package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {

    public Label HelloWorld;

    public void sayHelloWolrd(ActionEvent actionEvent) {

    }

    @FXML
    private void addScene(ActionEvent event)throws IOException{
        Parent view2 = FXMLLoader.load(getClass().getResource("window2.fxml"));

        Scene scene2 = new Scene(view2);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }




}
