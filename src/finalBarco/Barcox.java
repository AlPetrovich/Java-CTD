package finalBarco;

import java.util.ArrayList;
import java.util.List;

public class Barcox {
    private String nombre;
    private List<Carga> cargas;

    public Barcox(String nombre) {
        this.nombre = nombre;
        this.cargas = new ArrayList<>();
    }

    public void mostrarCarga(){
        for (Carga c: cargas){
            System.out.println(c.toString());
        }
    }
    public void agregarCarga(Carga c){
        cargas.add(c);
    }
}
