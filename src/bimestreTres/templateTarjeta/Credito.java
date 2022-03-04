package templateTarjeta;

public class Credito extends Tarjeta{

    private double limite;
    private double saldoUtilizado;

    public Credito(String numeroFrente, String codigoSeguridad, String fechaExpiracion, double limite, double saldoUtilizado) {
        super(numeroFrente, codigoSeguridad, fechaExpiracion);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    @Override
    public void autorizacion() {
        System.out.println("Pago autorizado, saldo utilizado"+saldoUtilizado);
    }

    @Override
    public void procesarPago(double importe) {
        if((importe + getSaldoUtilizado()) <= limite){
            setSaldoUtilizado(getSaldoUtilizado()+importe);
            autorizacion();
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }
}
