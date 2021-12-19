package facadeBanco;

public class Main {
    public static void main(String[] args) {
        Banco banco= new Banco();
        banco.agregarCuenta(new Cuenta("40584968","123456789",90000));
        banco.retirar("40584968","123456789",10000);
    }
}
