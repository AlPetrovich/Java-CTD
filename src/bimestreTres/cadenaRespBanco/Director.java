package bimestreTres.cadenaRespBanco;


//SUBCLASE que procesa la solicitud
public class Director extends EmpleadoBanco{

    @Override
    public void procesarSolicitud(Integer monto) {
        if (monto > 200000){
            System.out.println("Yo me encargo de gestionarlo Director");
        }else if ( getSiguienteEmpleado() != null){
            getSiguienteEmpleado().procesarSolicitud(monto);
        }
    }
}
