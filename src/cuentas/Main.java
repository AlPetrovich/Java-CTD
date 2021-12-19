package cuentas;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1= new Cliente(2231,"Petrovich","4123213","214214");
        Cuenta ca=new CuentaComitente(1000,cliente1,"123");
        ca.extraer(100);
        System.out.println(ca.informarSaldo());
        ca.extraer(700);
        ((CuentaComitente)ca).extraer(600,"123");
        System.out.println(ca.informarSaldo());
    }
}
