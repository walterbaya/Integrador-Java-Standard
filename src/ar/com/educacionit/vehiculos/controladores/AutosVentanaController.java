package ar.com.educacionit.vehiculos.controladores;

import ar.com.educacionit.vehiculos.App.Runner;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AutosVentanaController  implements Initializable  {
      
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
    public void cerrarVentana() {
       Stage escenario = (Stage)cerrar.getScene().getWindow();
       escenario.close();
    }
    @FXML
    public void abrirVentanaEdicion() throws IOException{
        this.runner.abrirVentanaAutosEdicion();
    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        editar.setDisable(true);
        borrar.setDisable(true);
    }

    

}
