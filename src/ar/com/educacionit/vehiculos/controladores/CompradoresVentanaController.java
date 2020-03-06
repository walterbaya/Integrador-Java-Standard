package ar.com.educacionit.vehiculos.controladores;

import ar.com.educacionit.vehiculos.App.Runner;
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

    private Runner runner;
    @FXML
    private Button cerrar;
    @FXML
    private Button editar;
    @FXML
    private Button borrar;

    public void setRunner(Runner runner){
        this.runner=runner;
    }
    
    @FXML
    private void cerrarVentana() {

    }

    @FXML
    public void abrirCompradoresEdicion() throws IOException {
        this.runner.abrirVentanaCompradoresEdicion();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        editar.setDisable(true);
        borrar.setDisable(true);
    }

}
