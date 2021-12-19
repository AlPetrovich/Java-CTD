package parcial02Mio;

public class Construccion {
    private String direccion;
    private int fechaInicio;
    private int fechaFinalizacionPrevista;
    private int fechaFinalizacionReal;

    public Construccion(String direccion, int fechaInicio, int fechaFinalizacionPrevista, int fechaFinalizacionReal) {
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacionPrevista = fechaFinalizacionPrevista;
        this.fechaFinalizacionReal = fechaFinalizacionReal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFechaFinalizacionPrevista() {
        return fechaFinalizacionPrevista;
    }

    public void setFechaFinalizacionPrevista(int fechaFinalizacionPrevista) {
        this.fechaFinalizacionPrevista = fechaFinalizacionPrevista;
    }

    public int getFechaFinalizacionReal() {
        return fechaFinalizacionReal;
    }

    public void setFechaFinalizacionReal(int fechaFinalizacionReal) {
        this.fechaFinalizacionReal = fechaFinalizacionReal;
    }
}
