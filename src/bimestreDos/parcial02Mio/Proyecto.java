package parcial02Mio;

public abstract class Proyecto {
    private Construccion construccion;
    private int idProyecto;
    private String nombreProyecto;
    private String ciudadProyecto;
    private String estatus;

    public Proyecto(Construccion construccion, int idProyecto, String nombreProyecto, String ciudadProyecto, String estatus) {
        this.construccion = construccion;
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.ciudadProyecto = ciudadProyecto;
        this.estatus = estatus;
    }

    public boolean finalizoEnFecha(){
        int finalizacionReal=construccion.getFechaFinalizacionReal();
        int finalizacionPrevista=construccion.getFechaFinalizacionPrevista();
        if (finalizacionReal==finalizacionPrevista && estatus=="finalizado"){
            return true;
        }else{
            return false;
        }
    }

    public boolean prueboOtro(){
        Integer finalizacionReal=construccion.getFechaFinalizacionReal();
        Integer finalizacionPrevista=construccion.getFechaFinalizacionPrevista();
        return(finalizacionPrevista.equals(finalizacionReal) && estatus=="finalizado");
    }
}
