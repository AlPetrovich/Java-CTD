package observerSubasta;

public class Oferente implements Observador{
    private String nombre;
    private String apellido;
    private String dni;
    private double montoTope;

    public Oferente(String nombre, String apellido, String dni, double montoTope) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoTope = montoTope;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getMontoTope() {
        return montoTope;
    }

    public void setMontoTope(double montoTope) {
        this.montoTope = montoTope;
    }

    @Override
    public void accionar(Subasta sub) {
       if (montoTope>sub.getMontoPesos()){
           System.out.println("Subasta comienza en"+ sub.getMontoPesos()+ nombre+" oferta: $"+ montoTope);
           sub.setMontoPesos(montoTope);
       }
    }
}
