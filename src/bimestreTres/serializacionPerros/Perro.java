package bimestreTres.serializacionPerros;

import java.io.Serializable;

//Para poder grabar perro debe implementar SERIALIZABLE
//podremos guardarlo en un archivo una serie de bytes
public class Perro implements Serializable {

    private String nombre;
    private String raza;
    private int edad;
    private String direccion;

    public Perro(String nombre, String raza, int edad, String direccion) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
