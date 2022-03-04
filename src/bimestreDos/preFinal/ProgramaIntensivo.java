package preFinal;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{
    private double porcentajeBonificacion;
    private List<OfertaAcademica> ofertaAcademica= new ArrayList<>(); //para no hacer constructor ya que tengo factory

    @Override
    public double calcularPrecio() {
        double total=0;
        for (OfertaAcademica oa: ofertaAcademica){
            total+=oa.calcularPrecio();
        }
        return total-(total*porcentajeBonificacion);   //prestar atencion si no hay algun % de descuento o aumento
    }

    public void addOfertaAcademica(OfertaAcademica oa){
        ofertaAcademica.add(oa);
    }

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public List<OfertaAcademica> getOfertaAcademica() {
        return ofertaAcademica;
    }

    public void setOfertaAcademica(List<OfertaAcademica> ofertaAcademica) {
        this.ofertaAcademica = ofertaAcademica;
    }
}
