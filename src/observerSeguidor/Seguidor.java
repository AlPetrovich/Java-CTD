package observerSeguidor;

public class Seguidor implements Observador{
    private String nombre;
    private String apellido;
    private int cantNotificacion;

    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantNotificacion = 0;
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

    public int getCantNotificacion() {
        return cantNotificacion;
    }

    public void setCantNotificacion(int cantNotificacion) {
        this.cantNotificacion = cantNotificacion;
    }

    @Override
    public void actualizar(String notificacion) {
        System.out.println(nombre+ notificacion);
        cantNotificacion++;
    }
}
