package ar.com.educacionit.vehiculos.controladores;

import ar.com.educacionit.vehiculos.App.Runner;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CompradoresEdicionController implements Initializable {

    private Runner runner;

    @FXML
    private Button alto;
    @FXML
    private Button largo;
    @FXML
    private Button ancho;
    @FXML
    private Button precio;
    @FXML
    private Button equipamiento;
    @FXML
    private Button cerrar;

    private void presionarOk() {

    }

    @FXML
    public void presionarCerrar() {
        Stage escenario = (Stage) cerrar.getScene().getWindow();
        escenario.close();
        runner.setCapa2Abierta(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

}
