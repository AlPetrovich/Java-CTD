package bimestreTres.cadenaRespBanco;

public class Gerente extends EmpleadoBanco{

    @Override
    public void procesarSolicitud(Integer monto) {
        if (monto >= 60000 && monto <= 200000){
            System.out.println("Yo me encargo de gestionarlo. Gerente");
        }else if (getSiguienteEmpleado() != null){
            getSiguienteEmpleado().procesarSolicitud(monto);
        }
    }
}
