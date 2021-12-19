package finalServicios;

public class Simple extends ServicioBrindado{
    private double precio;
    private static double INCREMENTO= 0.10;


    @Override
    public double calcularPrecio() {
        if (getNombre().equals("Colocacion")){
            return precio+(precio*INCREMENTO);
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Servico: "+ getNombre()+" Descripcion: "+ getDescripcion()+" Precio: "+calcularPrecio()+"\n";
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIncremento() {
        return INCREMENTO;
    }

    public void setIncremento(double incremento) {
        this.INCREMENTO = incremento;
    }
}
