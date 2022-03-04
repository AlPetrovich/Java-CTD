package templateTarjeta;

public class Debito extends Tarjeta{

    private double saldoDisponible;

    public Debito(String numeroFrente, String codigoSeguridad, String fechaExpiracion) {
        super(numeroFrente, codigoSeguridad, fechaExpiracion);
    }


    @Override
    public void autorizacion() {
        System.out.println("Pago autorizado con debito" + saldoDisponible);
    }

    @Override
    public void procesarPago(double importe) {
        if (importe <= saldoDisponible){
            setSaldoDisponible(saldoDisponible-importe);
            autorizacion();
        }
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
