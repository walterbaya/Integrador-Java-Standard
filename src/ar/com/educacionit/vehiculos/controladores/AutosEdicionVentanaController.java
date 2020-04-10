package ar.com.educacionit.vehiculos.controladores;

import ar.com.educacionit.base.entidades.EditionController;
import ar.com.educacionit.vehiculos.App.Runner;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AutosEdicionVentanaController extends EditionController implements Initializable {

    private Runner runner;

    @FXML
    private Button cerrar;
    @FXML
    private TextField alto;
    @FXML
    private TextField ancho;
    @FXML
    private TextField largo;
    @FXML
    private TextField precio;
    @FXML
    private TextArea equipamiento;

    @FXML
    private void presionarOk() {
        if (alto.getText().length() == 0) {
            errorPorVacioAlert("alto");
            alto.requestFocus();
        } else if (largo.getText().length() == 0) {
            errorPorVacioAlert("largo");
            largo.requestFocus();
        } else if (precio.getText().length() == 0) {
            errorPorVacioAlert("precio");
            precio.requestFocus();
        } else if (ancho.getText().length() == 0) {
            errorPorVacioAlert("ancho");
            ancho.requestFocus();
        } else if (equipamiento.getText().length() == 0) {
            errorPorVacioAlert("equipamiento");
            equipamiento.requestFocus();
        } else if (!super.errorPorNoEntero(alto, ancho, largo, precio, equipamiento)) {
            super.confirmacion(runner, cerrar);
        }
    }

    @FXML
    private void cerrarVentana() {
        super.cerrarVentanas(runner, cerrar);
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
