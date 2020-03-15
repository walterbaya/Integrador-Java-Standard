package ar.com.educacionit.vehiculos.controladores;

import ar.com.educacionit.vehiculos.App.Runner;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VendedoresEdicionController implements Initializable {

    private Runner runner;
    @FXML
    private Button cerrar;

    @FXML
    public void presionarCerrar() {
        Stage escenario = (Stage) cerrar.getScene().getWindow();
        escenario.close();
        runner.setCapa2Abierta(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

}
