package compositeOne;

public abstract class Elemento {

    private String nombre;
    public abstract double calcularPrecio();
    public abstract String mostrarNombre();

    public Elemento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
