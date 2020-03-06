/*
    redefinir el método toString() para que retorne una cadena de caracteres con el nombre, apellido, numeroDocumento y presupuesto
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Persona;


public class Comprador extends Persona{
    private double presupuesto;
    
    public Comprador(String nombre, String apellido, String numeroDocumento, int presupuesto) {
        super(nombre, apellido, numeroDocumento); 
        this.presupuesto=presupuesto;
    }

    /**
     * @return the presupuesto
     */
    public double getPresupuesto() {
        return presupuesto;
    }

        public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
        
    public String toString(){
        return super.toString()+"\n" + "El presupuesto es: " + this.presupuesto;
    }
    
}
