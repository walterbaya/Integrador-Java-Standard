package ar.com.educacionit.vehiculos.pruebas;

import ar.com.educacionit.vehiculos.entidades.Auto;
import ar.com.educacionit.vehiculos.entidades.Comprador;
import ar.com.educacionit.vehiculos.entidades.Vendedor;

public class Programa {

    public static void main(String[] args) {
        Auto a1 = new Auto("marca", "modelo", "color", 1, 2, 3);
        String auto1 = a1.toString();
        System.out.println(auto1);
        
        Comprador c1 = new Comprador("nombre", "apellido", "numeroDocumento", 1);
        String comprador1 = c1.toString();
        System.out.println(comprador1);
        
        Vendedor v1 = new Vendedor("nombre","apellido","numeroDocumento",15);
        String vendedor1=v1.toString();
        System.out.println(vendedor1);
    }
}
