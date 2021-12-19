package facadeBanco;

import java.util.List;

public class ServicioAutenticacion {

    boolean existeUsuario(List<Cuenta> cuentas, String dni, String clave){
        return cuentas.stream().anyMatch(cuenta -> cuenta.obtenerDNI().equals(dni) && cuenta.ObtenerContrasenia().equals(clave));
    }

    boolean validarUsuarioYClave(String dni, String clave){
        return dniValido(dni) && claveValida(clave);
    }

    private boolean dniValido(String dni) {
        boolean dniValido = true;
        if (!dni.isEmpty()) {
            try {
                Integer.parseInt(dni);
            } catch (NumberFormatException e) {
                dniValido = false;
            } catch (NullPointerException  e) {
                dniValido = false;
            }
        }
        return dniValido;
    }

    private boolean claveValida(String clave){
        return clave.length()>7;
    }
}
