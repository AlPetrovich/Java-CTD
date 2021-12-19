package preFinal2;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica{
    private double precioBasico;
    private List<OfertaAcademica> ofertasAcademicas= new ArrayList<>();


    @Override
    public double calcularPrecio() {
        double total=0;
        for (OfertaAcademica oa: ofertasAcademicas){
            total+=oa.calcularPrecio();
        }
        return total+precioBasico;
    }

    public void addOfertaAcademica(OfertaAcademica oa) throws Exception {
        if (oa instanceof Curso){
            Curso curso= (Curso) oa;
            if (curso.getCargaHorariaMensual()<10){
                throw new Exception("No se permiten cursos con menos de 10 horas de carga horaria");
            }
        }
        ofertasAcademicas.add(oa);
    }

    public double getPrecioBasico() {
        return precioBasico;
    }

    public void setPrecioBasico(double precioBasico) {
        this.precioBasico = precioBasico;
    }

    public List<OfertaAcademica> getOfertasAcademicas() {
        return ofertasAcademicas;
    }

    public void setOfertasAcademicas(List<OfertaAcademica> ofertasAcademicas) {
        this.ofertasAcademicas = ofertasAcademicas;
    }
}
