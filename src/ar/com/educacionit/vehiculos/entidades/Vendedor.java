/*
  redefinir el método toString() para que retorne una cadena de caracteres con el nombre, apellido, número de documento y    la cantidad de autos vendidos
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Persona;

public class Vendedor extends Persona{
    private int cantAutosVendidos;

    public Vendedor(String nombre, String apellido, String numeroDocumento, int cantAutosVendidos) {
        super(nombre, apellido, numeroDocumento);
        this.cantAutosVendidos=cantAutosVendidos;
    }

 
    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

 
    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }
    public String toString(){
        return super.toString()+ "La cantidad de autos vendidos es : " + this.cantAutosVendidos;
    }
}
