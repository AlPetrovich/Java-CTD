package templateMtarjetas;

public abstract class Tarjeta {
    private int nrosFrente;
    private int codigoSeguridad;
    private String fechaVencimiento;

    public Tarjeta(int nrosFrente, int codigoSeguridad, String fechaVencimiento) {
        this.nrosFrente = nrosFrente;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void cobrar(double importe){
        if (!estaVencida()){
            procesarPago(importe);
        }
    }
    public abstract void procesarPago(double importe);
    public abstract void mostrarPagoAutorizado();
    private boolean estaVencida(){
        return false;
    }
}
