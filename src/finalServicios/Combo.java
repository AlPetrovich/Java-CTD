package finalServicios;

import java.util.ArrayList;
import java.util.List;

public class Combo extends ServicioBrindado{
    private double descuento;
    private List<ServicioBrindado> serviciosBrindados= new ArrayList<>();

    @Override
    public double calcularPrecio() {
        double total=0;
        for (ServicioBrindado sb: serviciosBrindados){
            total+=sb.calcularPrecio();
        }
        return total-(total*descuento);
    }

    @Override
    public String toString() {
        String servicioStr="";
        for (ServicioBrindado sb: serviciosBrindados){
            servicioStr+= "\t* "+sb.toString();
        }
        return "----Combo: " + getNombre() +
                "\n\tDescripción: " + getDescripcion() +
                "\n\tServicios:\n" + servicioStr +
                "----Precio total del combo:\t$ " + this.calcularPrecio();
    }

    public void agregarServicioBrindado(ServicioBrindado sb){
        serviciosBrindados.add(sb);
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public List<ServicioBrindado> getServiciosBrindados() {
        return serviciosBrindados;
    }

    public void setServiciosBrindados(List<ServicioBrindado> serviciosBrindados) {
        this.serviciosBrindados = serviciosBrindados;
    }
}
