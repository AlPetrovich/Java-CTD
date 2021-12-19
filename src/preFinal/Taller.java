package preFinal;

public class Taller extends OfertaAcademica{
    private int cantTrabajosPracticos;
    private double valorTrabajoPractico;


    @Override
    public double calcularPrecio() {
        return cantTrabajosPracticos*valorTrabajoPractico;
    }

    public int getCantTrabajosPracticos() {
        return cantTrabajosPracticos;
    }

    public void setCantTrabajosPracticos(int cantTrabajosPracticos) {
        this.cantTrabajosPracticos = cantTrabajosPracticos;
    }

    public double getValorTrabajoPractico() {
        return valorTrabajoPractico;
    }

    public void setValorTrabajoPractico(double valorTrabajoPractico) {
        this.valorTrabajoPractico = valorTrabajoPractico;
    }
}
