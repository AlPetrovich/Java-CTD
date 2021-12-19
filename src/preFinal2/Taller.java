package preFinal2;

public class Taller extends OfertaAcademica{
    private double cantTP;
    private double precioTP;

    @Override
    public double calcularPrecio() {
        return cantTP*precioTP;
    }

    public double getCantTP() {
        return cantTP;
    }

    public void setCantTP(double cantTP) {
        this.cantTP = cantTP;
    }

    public double getPrecioTP() {
        return precioTP;
    }

    public void setPrecioTP(double precioTP) {
        this.precioTP = precioTP;
    }
}
