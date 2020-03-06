package ar.com.educacionit.base.entidades;

/*
Armar la clase Persona con los siguientes atributos:
nombre, de tipo String
apellido, de tipo String
numeroDocumento, de tipo String
Construir los setters y los getters de forma manual
Armar un constructor
 */
public abstract class Persona {

    private String nombre;
    private String apellido;
    private String numeroDocumento;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setDni(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDni() {
        return this.numeroDocumento;
    }

    public Persona(String nombre, String apellido, String numeroDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "El nombre es: " + this.getNombre() + "\n" + "El apellido es: "
                + this.getApellido() +"\n" +"El DNI es: " + this.numeroDocumento;
    }

}
