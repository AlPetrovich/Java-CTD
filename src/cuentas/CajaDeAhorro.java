package cuentas;

public class CajaDeAhorro extends Cuenta{
    private static final double TASA_DE_INTERES=1.2;

    public CajaDeAhorro(double saldo, Cliente cliente) {
        super(saldo, cliente);
    }


    @Override
    public void extraer(double monto) {
        if(informarSaldo()>=monto){
            setSaldo(informarSaldo()-monto);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void cobrarInteres(double interes){
        setSaldo(informarSaldo()*CajaDeAhorro.TASA_DE_INTERES);
    }

    @Override
    public void depositar(double monto) {
        if (monto<500000.0){
            setSaldo(informarSaldo()-monto);
        }else{
            System.out.println("No puede depositar mas de 500k");
        }
    }
}
