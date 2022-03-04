package bimestreDos.finalBarco;

import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Carga{
    private double pesoContenedor;
    private List<Carga> cargas= new ArrayList<>();

    @Override
    public double calcularPeso() {
        double total=0;
        for (Carga pe : cargas) {
            total+=pe.calcularPeso();
        }
        return total+pesoContenedor;
    }

    @Override
    public String toString() {
        String cargaString="";
        for (Carga carga: cargas){
            cargaString+="\t* "+ carga.toString();
        }
        return "Contenedor: "+ getNombre()+" Peso: "+ calcularPeso();
    }

    public void agregarCargas(Carga c){
        cargas.add(c);
    }

    public double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }
}
