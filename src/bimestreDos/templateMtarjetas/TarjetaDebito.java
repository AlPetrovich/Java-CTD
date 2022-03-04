package templateMtarjetas;

public class TarjetaDebito extends Tarjeta{
    private double saldoDisponible;

    public TarjetaDebito(int nrosFrente, int codigoSeguridad, String fechaVencimiento, double saldoDisponible) {
        super(nrosFrente, codigoSeguridad, fechaVencimiento);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public void procesarPago(double importe) {
        if (saldoDisponible>=importe){
            saldoDisponible-=importe;
            mostrarPagoAutorizado();
        }
    }

    @Override
    public void mostrarPagoAutorizado() {
        System.out.println("Pago exitoso tu saldo es de: "+saldoDisponible);
    }
}
