package preFinal2;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertasAcademicas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.ofertasAcademicas = new ArrayList<>();
    }

    public void generarInforme(){
        for (OfertaAcademica oa: ofertasAcademicas){
            System.out.println(oa.toString());
        }
    }
    public void agregarOferta(OfertaAcademica oa){
        ofertasAcademicas.add(oa);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<OfertaAcademica> getOfertasAcademicas() {
        return ofertasAcademicas;
    }

    public void setOfertasAcademicas(List<OfertaAcademica> ofertasAcademicas) {
        this.ofertasAcademicas = ofertasAcademicas;
    }
}
