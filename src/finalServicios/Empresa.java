package finalServicios;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<ServicioBrindado> serviciosBrindados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.serviciosBrindados = new ArrayList<>();
    }

    public void mostrarServicios(){
        for (ServicioBrindado sb: serviciosBrindados){
            System.out.println(sb.toString());
        }
    }

    public void agregarServicios(ServicioBrindado sb){
        serviciosBrindados.add(sb);
    }
}
