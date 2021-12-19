package parcial01;

public abstract class Proyecto {
    private Integer numeroProyecto;
    private String nombreProyecto;
    private String ciudadProyecto;
    private String estatus;
    private Contruccion contruccion;

    public Proyecto(Integer numeroProyecto, String nombreProyecto, String ciudadProyecto, String estatus, Contruccion contruccion) {
        this.numeroProyecto = numeroProyecto;
        this.nombreProyecto = nombreProyecto;
        this.ciudadProyecto = ciudadProyecto;
        this.estatus = estatus;
        this.contruccion = contruccion;
    }

    public boolean finalizoEnFecha(){
        Integer anioReal=contruccion.getAnioFinalizacionReal();
        Integer anioPrevisto=contruccion.getAnioFinalizacionPrevista();

        return(anioReal.equals(anioPrevisto) && estatus=="finalizado");
    }
}
