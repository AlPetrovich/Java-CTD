package bimestreTres.cadenaRespBanco;


//CLASE ---- MANEJADORA ----- comienza la cadena
public abstract class EmpleadoBanco {

    private EmpleadoBanco siguienteEmpleado;

    //1- metodo abstracto de procesamiento
    public abstract void procesarSolicitud(Integer monto);

    //2- setear siguiente clase
    public void setSiguienteEmpleado(EmpleadoBanco empleado){
        siguienteEmpleado = empleado;
    }

    //3- obtener siguiente clase
    public EmpleadoBanco getSiguienteEmpleado(){
        return siguienteEmpleado;
    }

}
