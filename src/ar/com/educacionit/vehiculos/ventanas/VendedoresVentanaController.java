package ar.com.educacionit.vehiculos.ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VendedoresVentanaController implements Initializable {

    @FXML
    private Button cerrar;
    @FXML
    private Button editar;
    @FXML
    private Button borrar;

    @FXML
    private void cerrarVentana() {
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        editar.setDisable(true);
        borrar.setDisable(true);
    }

}
