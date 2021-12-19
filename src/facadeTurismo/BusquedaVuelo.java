package facadeTurismo;

import java.util.ArrayList;

public class BusquedaVuelo {
    ArrayList<Vuelo> vuelos= new ArrayList<>();

    public void agregar(Vuelo vuelo){
        vuelos.add(vuelo);
    }
    public Vuelo buscar(String fechaSalida, String fechaRegreso, String origen, String destino){
        Vuelo buscando= new Vuelo(fechaSalida, fechaRegreso, origen, destino);
        return (Vuelo) Buscador.buscar(vuelos,buscando);
    }
}
