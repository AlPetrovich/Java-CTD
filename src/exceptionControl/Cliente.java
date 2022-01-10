package exceptionControl;

public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private double deuda;
    private double limite;

    public Cliente(String nombre, String apellido, String DNI, double saldoEnCuenta, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.deuda = 0;
        this.limite = limite;
    }

    public void comprar(double importe) throws ClienteException {
        if (deuda+importe > limite){
            throw new ClienteException("Error no puede pasar su limite establecido");
        }else{
            deuda+= importe;
        }
    }
    public void saldarDeuda(double importe) throws ClienteException {
        if (importe <= deuda){
            deuda-= importe;
        }else{
            throw new ClienteException("Error, usted quiere pagar mas de lo que debe");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
