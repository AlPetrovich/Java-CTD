package facadeBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco implements FachadaBanco{
    private ServicioAutenticacion servicioAutenticacion;
    private ServicioCuenta servicioCuenta;
    private ServicioCaja servicioCaja;
    private List<Cuenta>cuentas;

    public Banco() {
        this.servicioAutenticacion = new ServicioAutenticacion();
        this.servicioCuenta = new ServicioCuenta();
        this.servicioCaja = new ServicioCaja();
        this.cuentas= new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta){
        if (servicioAutenticacion.validarUsuarioYClave(cuenta.obtenerDNI(),cuenta.ObtenerContrasenia())){
            cuentas.add(cuenta);
        }
    }

    @Override
    public void retirar(String dni, String clave, double importe) {
        if (servicioAutenticacion.existeUsuario(cuentas,dni,clave)){
            Cuenta cuenta= this.servicioCuenta.obtenerCuenta(cuentas,dni);
            if (cuenta != null){
                this.servicioCaja.entregarDinero(cuenta,importe);
                cuenta.mostrarInformacion();
            }
        }
    }
}
