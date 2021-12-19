package templateMtarjetas;

public class TarjetaCredito extends Tarjeta{
    private double limite;
    private double saldoUtilizado;

    public TarjetaCredito(int nrosFrente, int codigoSeguridad, String fechaVencimiento, double limite, double saldoUtilizado) {
        super(nrosFrente, codigoSeguridad, fechaVencimiento);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
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

    @Override
    public void procesarPago(double importe) {
        if ((saldoUtilizado+importe)<=limite){
            saldoUtilizado+=importe;
            mostrarPagoAutorizado();
        }
    }

    @Override
    public void mostrarPagoAutorizado() {
        System.out.println("Pago exitoso tu saldo utilizado es de: "+getSaldoUtilizado());
    }
}
