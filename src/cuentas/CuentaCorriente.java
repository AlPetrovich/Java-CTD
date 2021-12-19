package cuentas;

public class CuentaCorriente extends Cuenta implements GravadorImpuesto{
    private double montoAutorizado;

    public CuentaCorriente(double saldo, Cliente cliente, double montoAutorizado) {
        super(saldo, cliente);
        this.montoAutorizado=montoAutorizado;
    }


    @Override
    public void extraer(double monto) {
        if (informarSaldo()>=monto){
            setSaldo(informarSaldo()-monto);
        }else if (informarSaldo()<=monto && informarSaldo()+montoAutorizado>=monto){
            setSaldo((informarSaldo()+montoAutorizado)-monto);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public double gravar(double porcentaje) {
        double monto= informarSaldo()*porcentaje;
        setSaldo(informarSaldo()-monto);
        return monto;
    }
}
