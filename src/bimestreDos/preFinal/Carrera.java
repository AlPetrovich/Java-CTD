package preFinal;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica{
    private double valorBasico;
    private List<OfertaAcademica> ofertasAcademicas= new ArrayList<>();

    @Override
    public double calcularPrecio() {
        double total=0;
        for (OfertaAcademica oa: ofertasAcademicas){
            total+=oa.calcularPrecio();
        }
        return total+valorBasico;
    }

    public void agregarOfertaAcademica(OfertaAcademica oa) throws Exception {
        if (oa instanceof Curso){
            Curso c= (Curso)oa;
            if (c.getCargaHoraria()<10){
                throw new Exception("No se permiten cursos de menos de 10 horas");
            }
        }
        ofertasAcademicas.add(oa);
    }

    public double getValorBasico() {
        return valorBasico;
    }

    public void setValorBasico(double valorBasico) {
        this.valorBasico = valorBasico;
    }

    public List<OfertaAcademica> getOfertasAcademicas() {
        return ofertasAcademicas;
    }

    public void setOfertasAcademicas(List<OfertaAcademica> ofertasAcademicas) {
        this.ofertasAcademicas = ofertasAcademicas;
    }
}
