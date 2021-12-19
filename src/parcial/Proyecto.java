package parcial;

public abstract class Proyecto {
    private Construccion construccion;
    private Integer numeroIdentificacion;
    private String nombre;
    private String ciudad;
    private String estatus;

    public Proyecto(Construccion construccion, Integer numeroIdentificacion, String nombre, String ciudad, String estatus) {
        this.construccion = construccion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estatus = estatus;
    }

    public Boolean finalizoEnFecha(){
        int finalizoEnFechaPrevista=construccion.getAnioFinalizacionPrevista()-construccion.getAnioFinalizacionReal();
        Boolean finalizoEnFechaYEstaFinalizado=false;

        if (finalizoEnFechaPrevista==0 && estatus=="finalizado"){
            finalizoEnFechaYEstaFinalizado=true;
        }
        return finalizoEnFechaYEstaFinalizado;
    }
}
