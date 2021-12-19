package preFinal2;

public class Curso extends OfertaAcademica{
    private double cargaHorariaMensual;
    private double mesesDuracion;
    private double precioHora;


    @Override
    public double calcularPrecio() {
        return cargaHorariaMensual*mesesDuracion*precioHora;
    }

    public double getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setCargaHorariaMensual(double cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public double getMesesDuracion() {
        return mesesDuracion;
    }

    public void setMesesDuracion(double mesesDuracion) {
        this.mesesDuracion = mesesDuracion;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
}
