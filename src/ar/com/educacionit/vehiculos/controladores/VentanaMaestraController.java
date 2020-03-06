package ar.com.educacionit.vehiculos.controladores;

import ar.com.educacionit.vehiculos.App.Runner;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class VentanaMaestraController implements Initializable {

    private Runner runner;

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

    public void AbrirVentanaAutos() throws IOException {
        this.runner.abrirVentanaAutos();
    }

    public void AbrirVentanaVendedores() throws IOException {
        this.runner.abrirVentanaVendedores();
    }

    public void AbrirVentanaCompradores() throws IOException {
        this.runner.abrirVentanaCompradores();
    }

    public void AbrirVentanaConfiguracion() throws IOException {
        this.runner.abrirVentanaConfiguracion();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
