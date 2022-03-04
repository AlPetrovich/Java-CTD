package templateTarjeta;

public abstract class Tarjeta {

    private String numeroFrente;
    private String codigoSeguridad;
    private String fechaExpiracion;

    public Tarjeta(String numeroFrente, String codigoSeguridad, String fechaExpiracion) {
        this.numeroFrente = numeroFrente;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaExpiracion = fechaExpiracion;
    }

    public void pagar(double importe){

        if (!estaVencida()){
            procesarPago(importe);
        }
    }

    public abstract void autorizacion();
    public abstract void procesarPago(double importe);

    public boolean estaVencida(){
        return false;
    }
}
