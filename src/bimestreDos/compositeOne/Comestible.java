package bimestreDos.compositeOne;
public class Comestible extends Elemento{
    private double precio;

    public Comestible(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrarNombre() {
        return getNombre();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
