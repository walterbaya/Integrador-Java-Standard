package ar.com.educacionit.vehiculos.ventanas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CompradoresVentanaController implements Initializable {

    @FXML
    private Button cerrar;
    @FXML
    private Button editar;
    @FXML
    private Button borrar;

    @FXML
    private void cerrarVentana() {
       
    }

    @FXML
    public void abrirAutosEdicion() throws IOException {
         
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        editar.setDisable(true);
        borrar.setDisable(true);
    }


}
