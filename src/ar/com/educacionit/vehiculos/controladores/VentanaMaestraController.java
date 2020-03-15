package ar.com.educacionit.vehiculos.controladores;

import ar.com.educacionit.vehiculos.App.Runner;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class VentanaMaestraController implements Initializable {

    private Runner runner;

    @FXML
    public void cerrarVentana() throws Exception {
        if (!(runner.isCapa1Abierta() || runner.isCapa2Abierta())) {
            Platform.exit();
        }
    }

    @FXML
    public void setRunner(Runner runner) {
        this.runner = runner;
    }

    @FXML
    public void AbrirVentanaAutos() throws IOException {
        this.runner.abrirVentanaAutos();
    }

    @FXML
    public void AbrirVentanaVendedores() throws IOException {
        this.runner.abrirVentanaVendedores();
    }

    @FXML
    public void AbrirVentanaCompradores() throws IOException {
        this.runner.abrirVentanaCompradores();
    }

    @FXML
    public void AbrirVentanaConfiguracion() throws IOException {
        this.runner.abrirVentanaConfiguracion();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
