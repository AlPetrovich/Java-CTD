package bimestreTres.serializacionContactos;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private String mail;
    private String telefono;

    public Persona(String nombre, String mail, String telefono) {
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
