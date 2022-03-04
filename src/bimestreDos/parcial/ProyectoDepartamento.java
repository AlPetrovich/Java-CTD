package parcial;

public class ProyectoDepartamento extends Proyecto implements Comparable{
    private Integer cantidadDePisos;
    private Integer cantidadDepartamentos;

    public ProyectoDepartamento(Construccion construccion, Integer numeroIdentificacion, String nombre, String ciudad, String estatus, Integer cantidadDePisos, Integer cantidadDepartamentos) {
        super(construccion, numeroIdentificacion, nombre, ciudad, estatus);
        this.cantidadDePisos = cantidadDePisos;
        this.cantidadDepartamentos = cantidadDepartamentos;
    }
    public Boolean esRascacielos(){
        return cantidadDePisos>15;
    }

    @Override
    public int compareTo(Object obj) {
        ProyectoDepartamento pd=(ProyectoDepartamento) obj;
        if (cantidadDePisos*cantidadDepartamentos>pd.cantidadDePisos*pd.cantidadDepartamentos){
            return 1;
        }
        if (cantidadDePisos*cantidadDepartamentos<pd.cantidadDePisos*pd.cantidadDepartamentos){
            return -1;
        }
        return 0;
    }
}
