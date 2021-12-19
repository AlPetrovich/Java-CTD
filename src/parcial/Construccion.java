package parcial;

public class Construccion {
    private String direccion;
    private Integer anioInicio;
    private Integer anioFinalizacionPrevista;
    private Integer anioFinalizacionReal;

    public Construccion(String direccion, Integer anioInicio, Integer anioFinalizacionPrevista, Integer anioFinalizacionReal) {
        this.direccion = direccion;
        this.anioInicio = anioInicio;
        this.anioFinalizacionPrevista = anioFinalizacionPrevista;
        this.anioFinalizacionReal = anioFinalizacionReal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(Integer anioInicio) {
        this.anioInicio = anioInicio;
    }

    public Integer getAnioFinalizacionPrevista() {
        return anioFinalizacionPrevista;
    }

    public void setAnioFinalizacionPrevista(Integer anioFinalizacionPrevista) {
        this.anioFinalizacionPrevista = anioFinalizacionPrevista;
    }

    public Integer getAnioFinalizacionReal() {
        return anioFinalizacionReal;
    }

    public void setAnioFinalizacionReal(Integer anioFinalizacionReal) {
        this.anioFinalizacionReal = anioFinalizacionReal;
    }
}
