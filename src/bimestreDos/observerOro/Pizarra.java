package bimestreDos.observerOro;

import java.util.ArrayList;

public class Pizarra implements Observable{

    private float precioActual;
    private ArrayList<Observador> observadores= new ArrayList<>();

    public void cambiarPrecio(float precio){
        precioActual=precio;
        notificar("Precio actualizado a "+ obtenerPrecio());
    }

    public float obtenerPrecio(){
        return precioActual;
    }

    @Override
    public void agregar(Observador o) {
        observadores.add(o);
    }

    @Override
    public void quitar(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificar(String cambio) {
        for (Observador o: observadores){
            System.out.println(o.actualizar()+ cambio);
        }
    }
}
