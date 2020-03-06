package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Vehiculo;

public class Auto extends Vehiculo {

    private String marca;
    private String modelo;
    private String color;

    public Auto(String marca, String modelo,String color, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    @Override
    public String toString() {
        return "La marca es: " + this.marca +"\n" + "El modelo es: " + this.modelo + "\n"+ "El color es: " + this.color +"\n"+ super.toString();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
