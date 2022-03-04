package bimestreDos.compositeOne;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Elemento{

    private List<Elemento> elementos;

    public Combo(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    @Override
    public double calcularPrecio() {
        double total= 0;
        for (Elemento e: elementos){
            total+= e.calcularPrecio();
        }
        return total;
    }

    @Override
    public String mostrarNombre() {
        return getNombre();
    }
    public void addElemento(Elemento e){
        elementos.add(e);
    }
}
