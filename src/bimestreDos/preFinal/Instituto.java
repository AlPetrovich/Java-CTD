package preFinal;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertasDisponibles;

    public Instituto(String nombre){
        this.nombre=nombre;
        ofertasDisponibles= new ArrayList<>();
    }

    public void agregarOferta(OfertaAcademica oa){
        ofertasDisponibles.add(oa);
    }

    public void generarInforme(){
        for (OfertaAcademica oa: ofertasDisponibles){
            System.out.println(oa.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<OfertaAcademica> getOfertasDisponibles() {
        return ofertasDisponibles;
    }

    public void setOfertasDisponibles(List<OfertaAcademica> ofertasDisponibles) {
        this.ofertasDisponibles = ofertasDisponibles;
    }
}
