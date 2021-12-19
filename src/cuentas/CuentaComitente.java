package cuentas;

public class CuentaComitente extends Cuenta{
    private String clave;
    private static final double COMISION=0.01;

    public CuentaComitente(double saldo, Cliente cliente, String clave) {
        super(saldo, cliente);
        this.clave=clave;
    }


    @Override
    public void extraer(double monto) {
        if (informarSaldo()*0.5>=monto){
            setSaldo(informarSaldo()-monto);
        }else{
            System.out.println("Para extraer mas de la mitad debe ingresar contraseña");
        }
    }

    public void extraer(double monto,String contra){
        if (informarSaldo()>=monto && clave.equals(contra)){
            setSaldo(informarSaldo()-monto);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double monto){
        setSaldo(informarSaldo()+(monto-(monto*CuentaComitente.COMISION)));
    }

    @Override
    public void depositar(double monto, double tipoDeCambio){
        setSaldo(informarSaldo()+(monto*tipoDeCambio*0.99));
    }
}
