package templateMtarjetas;

public class Main {
    public static void main(String[] args) {
        Tarjeta t1= new TarjetaDebito(1234,444,"10-2-2",1000);
        Tarjeta t2= new TarjetaCredito(333,234,"9-3-3",3000,1500);
        t1.procesarPago(200);
        t2.procesarPago(1500);
    }
}
