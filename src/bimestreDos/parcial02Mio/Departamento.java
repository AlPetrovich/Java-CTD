package parcial02Mio;

public class Departamento extends Proyecto implements Comparable{
    private int cantidadPisos;
    private int deptosPorPiso;

    public Departamento(Construccion construccion, int idProyecto, String nombreProyecto, String ciudadProyecto, String estatus, int cantidadPisos, int deptosPorPiso) {
        super(construccion, idProyecto, nombreProyecto, ciudadProyecto, estatus);
        this.cantidadPisos = cantidadPisos;
        this.deptosPorPiso = deptosPorPiso;
    }

    @Override
    public int compareTo(Object obj) {
        Departamento dpto2= (Departamento) obj;
        int resultado=0;
        int depto1=this.cantidadPisos*this.deptosPorPiso;
        int depto2=dpto2.cantidadPisos*dpto2.deptosPorPiso;
        if (depto1>depto2){
            resultado=1;
        }else if (depto1<depto2){
            resultado=-1;
        }
        return resultado;
    }

    public boolean esRascacielos(){
        return cantidadPisos>15;
    }
}
