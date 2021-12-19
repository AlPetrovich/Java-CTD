package facadeBanco;

public class Cuenta {
    private String DNI;
    private String contrasenia;
    private double saldoActual;

    public Cuenta(String DNI, String contrasenia, double saldoActual) {
        this.DNI = DNI;
        this.contrasenia = contrasenia;
        this.saldoActual = saldoActual;
    }

    public void retirarDinero(double importe){
        if (saldoActual-importe>=0){
            saldoActual-=importe;
        }
    }

    public void mostrarInformacion(){
        System.out.println("DNI: "+DNI+" Saldo actual: "+saldoActual);
    }



    public String obtenerDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String ObtenerContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
}
