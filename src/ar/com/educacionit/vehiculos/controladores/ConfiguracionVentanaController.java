package ar.com.educacionit.vehiculos.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ConfiguracionVentanaController implements Initializable {

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
     ;
    }

}
