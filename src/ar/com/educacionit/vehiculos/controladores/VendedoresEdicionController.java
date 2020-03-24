package ar.com.educacionit.vehiculos.controladores;

import ar.com.educacionit.vehiculos.App.Runner;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VendedoresEdicionController implements Initializable {

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

    private void errorPorVacio(String nombreTextField) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Dialogo de error");
        alerta.setHeaderText("Alguna caja esta vacia");
        alerta.setContentText("El " + nombreTextField + " no puede estar vacio");
        alerta.showAndWait();
    }

    private void confirmacion() {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Dialogo de confirmacion");
        alerta.setHeaderText("Está a punto de guardar los datos, desea continuar");
        Optional<ButtonType> resultado = alerta.showAndWait();
        if (resultado.get() == ButtonType.OK) {
            cerrarVentana();
        }
    }

    @FXML
    private void presionarOk() {
        if (alto.getText().length() == 0) {
            errorPorVacio("alto");
            alto.requestFocus();
        } else if (largo.getText().length() == 0) {
            errorPorVacio("largo");
            largo.requestFocus();
        } else if (precio.getText().length() == 0) {
            errorPorVacio("precio");
            precio.requestFocus();
        } else if (ancho.getText().length() == 0) {
            errorPorVacio("ancho");
            ancho.requestFocus();
        } else if (equipamiento.getText().length() == 0) {
            errorPorVacio("equipamiento");
            equipamiento.requestFocus();
        } else {
            confirmacion();
        }
    }

    @FXML
    private void cerrarVentana() {
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
