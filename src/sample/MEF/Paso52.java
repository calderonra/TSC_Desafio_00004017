package sample.MEF;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Paso52 {


    @FXML
    private void addS(ActionEvent event)throws IOException {
        Parent view2 = FXMLLoader.load(getClass().getResource("../Ventanas/Paso6MEF.fxml"));

        Scene scene2 = new Scene(view2);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
}
