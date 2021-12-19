package cuentas;

public abstract class Cuenta {
    private double saldo;
    private Cliente cliente;

    public Cuenta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }



    public double informarSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto){
        saldo+=monto;
    }
    public void depositar(double monto, double tipoDeCambio){
        saldo+=monto*tipoDeCambio;
    }

    public abstract void extraer(double monto);
}
