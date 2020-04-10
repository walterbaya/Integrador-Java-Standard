package ar.com.educacionit.base.entidades;

import ar.com.educacionit.vehiculos.App.Runner;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public abstract class EditionController {
    
    public void errorPorNoEnteroAlert(String nombreTextField) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Dialogo de error");
        alerta.setContentText("El " + nombreTextField + " debe ser un int");
        alerta.showAndWait();
    }
     public void errorPorNoDecimalAlert(String nombreTextField) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Dialogo de error");
        alerta.setContentText("El " + nombreTextField + " debe ser un decimal");
        alerta.showAndWait();
    }

    public void errorPorVacioAlert(String nombreTextField) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Dialogo de error");
        alerta.setHeaderText("Alguna caja esta vacia");
        alerta.setContentText("El " + nombreTextField + " no puede estar vacio");
        alerta.showAndWait();
    }

    
  
    public void cerrarVentanas(Runner runner, Button cerrar) {
        Stage escenario = (Stage) cerrar.getScene().getWindow();
        escenario.close();
    }

    public void confirmacion(Runner runner, Button cerrar) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Dialogo de confirmacion");
        alerta.setHeaderText("Está a punto de guardar los datos, desea continuar");
        Optional<ButtonType> resultado = alerta.showAndWait();
        if (resultado.get() == ButtonType.OK) {
            cerrarVentanas(runner, cerrar);
        }
    }

    public boolean errorPorNoEntero(TextField alto, TextField ancho, TextField largo, TextField precio, TextArea equipamiento) {
        int valorAlto = 0;
        int valorAncho = 0;
        int valorLargo = 0;
        boolean error = false;
        try {
            valorAlto = Integer.parseInt(alto.getText());
        } catch (NumberFormatException e) {
            System.out.println("Error el alto no es un entero");
            errorPorNoEnteroAlert("alto");
            error = true;
        }
        try {
            valorAncho = Integer.parseInt(ancho.getText());
        } catch (NumberFormatException e) {
            System.out.println("Error el ancho no es un entero");
            errorPorNoEnteroAlert("ancho");
            error = true;
        }
        try {
            valorLargo = Integer.parseInt(largo.getText());
        } catch (NumberFormatException e) {
            System.out.println("Error el largo no es un entero");
            errorPorNoEnteroAlert("largo");
            error = true;
        }
        return error;
    }

    public boolean errorPorNoDecimal(TextField precio, TextField alto) {
        double p = 0;
        boolean error = false;
        try {
            p = Double.parseDouble(precio.getText());
        } catch (NumberFormatException e) {
            System.out.println("Error el precio debe ser un numero con coma.");
            errorPorNoDecimalAlert("precio");
            error = true;
        }
        return error;
    }
}
