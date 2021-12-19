package preFinal2;

import java.util.ArrayList;
import java.util.List;

public class Programa extends OfertaAcademica{
    private double porcentajeBonificacion;
    private List<OfertaAcademica> ofertasAcademicas= new ArrayList<>();

    @Override
    public double calcularPrecio() {
        double total=0;
        for (OfertaAcademica oa: ofertasAcademicas){
            total+=oa.calcularPrecio();
        }
        return total-(total*porcentajeBonificacion);
    }
    public void addOfertaAcademica(OfertaAcademica oa){
        ofertasAcademicas.add(oa);
    }

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public List<OfertaAcademica> getOfertasAcademicas() {
        return ofertasAcademicas;
    }

    public void setOfertasAcademicas(List<OfertaAcademica> ofertasAcademicas) {
        this.ofertasAcademicas = ofertasAcademicas;
    }
}
