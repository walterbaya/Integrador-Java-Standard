package ar.com.educacionit.vehiculos.ventanas;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Runner extends Application {

    private Stage escenarioPrincipal;
    private AnchorPane diseñoDeLaVentana;

    @Override
    public void start(Stage escenarioPrincipal) throws IOException {
        this.escenarioPrincipal = escenarioPrincipal;
        escenarioPrincipal.setTitle("Ventana Principal");
        iniciarVentanaMaestra();
    }

    private void iniciarVentanaMaestra() throws IOException {
        //CARGA DEL DISEÑO
        /**
         * El cargador se usa para meter el diseño de la pantalla en la escena y
         * luego la misma en el escenario
         */
        FXMLLoader cargador = new FXMLLoader();
        /**
         * Este algoritmo es necesario para cargar la pantalla que diseñe con el
         * gluon el .fxml
         */
        cargador.setLocation(getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/VentanaMaestra.fxml"));
        diseñoDeLaVentana = (AnchorPane) cargador.load();
        //PUESTA EN ESCENA DEL DISEÑO
        Scene escenaPrincipal = new Scene(diseñoDeLaVentana);
        //PUESTA EN EL ESCENARIO DE LA ESCENA
        escenarioPrincipal.setScene(escenaPrincipal);
        //MOSTRAR EL ESCENARIO O COMENZAR LA OBRA 
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
