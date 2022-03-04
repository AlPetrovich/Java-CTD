package parcial01;

public class Contruccion {
    private String direccion;
    private Integer fechaInicio;
    private Integer anioFinalizacionReal;
    private Integer anioFinalizacionPrevista;

    public Contruccion(String direccion, Integer fechaInicio, Integer anioFinalizacionReal, Integer anioFinalizacionPrevista) {
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.anioFinalizacionReal = anioFinalizacionReal;
        this.anioFinalizacionPrevista = anioFinalizacionPrevista;
    }

    public Integer getAnioFinalizacionReal() {
        return anioFinalizacionReal;
    }

    public Integer getAnioFinalizacionPrevista() {
        return anioFinalizacionPrevista;
    }

}
