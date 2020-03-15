package ar.com.educacionit.vehiculos.controladores;

import ar.com.educacionit.vehiculos.App.Runner;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConfiguracionVentanaController implements Initializable {

    private Runner runner;
    @FXML
    private TextField version;
    @FXML
    private TextField java;
    @FXML
    private TextField usuario;
    @FXML
    private TextField sistema;
    @FXML
    private Button cerrar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sistema.setText(System.getProperty("os.name"));
        usuario.setText(System.getProperty("user.name"));
        version.setText(System.getProperty("os.version"));
        java.setText(System.getProperty("java.version"));
        java.setDisable(true);
        version.setDisable(true);
        usuario.setDisable(true);
        sistema.setDisable(true);
    }

    @FXML
    public void cerrarVentana() {
     Stage escenario = (Stage)cerrar.getScene().getWindow();
     escenario.close();
     runner.setCapa1Abierta(false);
    }
    
    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

}
