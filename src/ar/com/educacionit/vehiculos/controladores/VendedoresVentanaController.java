package ar.com.educacionit.vehiculos.controladores;

import ar.com.educacionit.vehiculos.App.Runner;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class VendedoresVentanaController implements Initializable {
    
    private Runner runner;
    @FXML
    private Button nuevo;
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
    private void abrirVentanaEdicion() throws IOException{
        this.runner.abrirVentanaVendedoresEdicion();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        editar.setDisable(true);
        borrar.setDisable(true);
    }

}
