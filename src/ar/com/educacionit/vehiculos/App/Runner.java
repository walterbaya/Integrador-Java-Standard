package ar.com.educacionit.vehiculos.App;

import ar.com.educacionit.vehiculos.controladores.AutosVentanaController;
import ar.com.educacionit.vehiculos.controladores.CompradoresVentanaController;
import ar.com.educacionit.vehiculos.controladores.VendedoresVentanaController;
import ar.com.educacionit.vehiculos.controladores.VentanaMaestraController;
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Runner extends Application {

    private Stage escenarioPrincipal = new Stage() ;
    private Stage escenarioCompradores = new Stage();
    private Stage escenarioAutos = new Stage();
    private Stage escenarioVendedores = new Stage();
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

        VentanaMaestraController controller = cargador.getController();
        controller.setRunner(this);
        escenarioPrincipal.setTitle("Home");
        //PUESTA EN ESCENA DEL DISEÑO
        Scene escenaPrincipal = new Scene(diseñoDeLaVentana);
        //PUESTA EN EL ESCENARIO DE LA ESCENA
        escenarioPrincipal.setScene(escenaPrincipal);
        //MOSTRAR EL ESCENARIO O COMENZAR LA OBRA 
        escenarioPrincipal.show();
    }

    //COMPRADORES
    public void abrirVentanaCompradores() throws IOException {
        FXMLLoader cargador = new FXMLLoader();
        cargador.setLocation(getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/CompradoresVentana.fxml"));
        AnchorPane dibujosVentana = (AnchorPane) cargador.load();

        CompradoresVentanaController controller = cargador.getController();
        controller.setRunner(this);
        
        escenarioCompradores.setTitle("Ventana Compradores");
        Scene escena = new Scene(dibujosVentana);
        escenarioCompradores.setScene(escena);
        escenarioCompradores.show();
    }

    public void abrirVentanaCompradoresEdicion() throws IOException {
        FXMLLoader cargador = new FXMLLoader();
        cargador.setLocation(getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/CompradoresEdicion.fxml"));
        AnchorPane dibujosVentana = (AnchorPane) cargador.load();

        Stage escenario = new Stage();

        escenario.initOwner(escenarioCompradores);
        escenario.setTitle("Ventana compradores Edicion");
        Scene escena = new Scene(dibujosVentana);
        escenario.setScene(escena);
        escenario.show();
    }

    //VENDEDORES
    public void abrirVentanaVendedores() throws IOException {
        FXMLLoader cargador = new FXMLLoader();
        cargador.setLocation(getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/VendedoresVentana.fxml"));
        AnchorPane dibujosVentana = (AnchorPane) cargador.load();
        
        VendedoresVentanaController controller = cargador.getController();
        controller.setRunner(this);

        escenarioVendedores.setTitle("Vendedores");
        Scene escena = new Scene(dibujosVentana);
        escenarioVendedores.setScene(escena);
        escenarioVendedores.show();
    }

    public void abrirVentanaVendedoresEdicion() throws IOException {
        FXMLLoader cargador = new FXMLLoader();
        cargador.setLocation(getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/VendedoresEdicion.fxml"));
        AnchorPane dibujosVentana = (AnchorPane) cargador.load();

        Stage escenario = new Stage();

        escenario.initOwner(escenarioVendedores);
        escenario.setTitle("Ventana Vendedores Edicion");
        Scene escena = new Scene(dibujosVentana);
        escenario.setScene(escena);
        escenario.show();
    }

    //AUTOS
    public void abrirVentanaAutos() throws IOException {
        FXMLLoader cargador = new FXMLLoader();
        cargador.setLocation(getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/AutosVentana.fxml"));
        AnchorPane dibujosVentana = (AnchorPane) cargador.load();

        AutosVentanaController controller = cargador.getController();
        controller.setRunner(this);
        
        Scene escena = new Scene(dibujosVentana);
        escenarioAutos.setScene(escena);
        escenarioAutos.show();
    }
    
    public void abrirVentanaAutosEdicion() throws IOException {
        FXMLLoader cargador = new FXMLLoader();
        cargador.setLocation(getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/AutosEdicionVentana.fxml"));
        AnchorPane dibujosVentana = (AnchorPane) cargador.load();

        Stage escenario = new Stage();

        escenario.initOwner(escenarioAutos);
        escenario.setTitle("Ventana Autos Edicion");
        Scene escena = new Scene(dibujosVentana);
        escenario.setScene(escena);
        escenario.show();;
    }
    
    //CONFIGURACION
    public void abrirVentanaConfiguracion() throws IOException {
        FXMLLoader cargador = new FXMLLoader();
        cargador.setLocation(getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/ConfiguracionVentana.fxml"));
        AnchorPane dibujosVentana = (AnchorPane) cargador.load();

        Stage escenario = new Stage();

        Scene escena = new Scene(dibujosVentana);
        escenario.setScene(escena);
        escenario.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
