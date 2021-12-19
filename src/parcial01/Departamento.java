package parcial01;

public class Departamento extends Proyecto implements Comparable {
    private Integer cantidadPisos;
    private Integer departamentosPorPiso;

    public Departamento(Integer numeroProyecto, String nombreProyecto, String ciudadProyecto, String estatus, Contruccion contruccion, Integer cantidadPisos, Integer departamentosPorPiso) {
        super(numeroProyecto, nombreProyecto, ciudadProyecto, estatus, contruccion);
        this.cantidadPisos = cantidadPisos;
        this.departamentosPorPiso = departamentosPorPiso;
    }

    @Override
    public int compareTo(Object obj) {
        Departamento dp=(Departamento) obj;

        int departamento1=(cantidadPisos*departamentosPorPiso);
        int departamento2=(dp.cantidadPisos*dp.departamentosPorPiso);

        return Integer.compare(departamento1,departamento2);
    }
    public boolean esRascacielos(){
        return cantidadPisos>15;
    }
}
