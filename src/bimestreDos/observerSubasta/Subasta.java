package observerSubasta;

import java.util.ArrayList;
import java.util.List;

public class Subasta implements Sujeto{
    private double montoPesos;
    private String descripcion;
    private List<Observador> oferentes;

    public Subasta(double montoPesos, String descripcion) {
        this.montoPesos = montoPesos;
        this.descripcion = descripcion;
        this.oferentes = new ArrayList<>();
    }

    public double getMontoPesos() {
        return montoPesos;
    }

    public void setMontoPesos(double montoPesos) {
        this.montoPesos = montoPesos;
        notificar();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void agregarObservador(Observador obs) {
        oferentes.add(obs);
    }

    @Override
    public void eliminarObservador(Observador obs) {
        oferentes.remove(obs);
    }

    @Override
    public void notificar() {
        for (Observador of: oferentes){
            of.accionar(this);
        }
    }
    public void iniciarSubasta(){
        notificar();
    }
}
