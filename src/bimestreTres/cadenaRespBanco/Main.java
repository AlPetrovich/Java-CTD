package bimestreTres.cadenaRespBanco;

public class Main {

    public static void main(String[] args) {
        EmpleadoBanco ejecutivo = new EjecutivoCuenta();
        EmpleadoBanco gerente = new Gerente();
        EmpleadoBanco director = new Director();

        gerente.setSiguienteEmpleado(director);
        ejecutivo.setSiguienteEmpleado(gerente);
        ejecutivo.procesarSolicitud(70000);

    }
}
