package bimestreDos.finalBarco;

public abstract class Carga {
    private String nombre;
    private String descripcion;

    public abstract double calcularPeso();

    public abstract String toString();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
