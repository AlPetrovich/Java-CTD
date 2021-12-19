package finalPizza;

public class PizzaSimple extends Pizza{
    private double precioBase;
    private String tamanio;


    @Override
    public double calcularPrecio() {
        if (tamanio.equals("Grande")){
            return precioBase*2;
        }
        return precioBase;

    }

    @Override
    public String toString() {
        return "Pizza "+ getNombre()+"- tamaño: "+ getTamanio()+"- Precio: $"+calcularPrecio();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}
