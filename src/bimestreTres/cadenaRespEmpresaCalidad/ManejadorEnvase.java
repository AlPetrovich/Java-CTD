package bimestreTres.cadenaRespEmpresaCalidad;

public class ManejadorEnvase extends Manejador{

    @Override
    public void comprobar(Articulo art) {
        if (!art.getEnvase().equalsIgnoreCase("sano") &&
        !art.getEnvase().equalsIgnoreCase("casi sano")){
            System.out.println("Rechazado por envase");
        }else{
            if (this.getSiguienteManejador() != null){
                //LLamamos al meotodo en el siguiente objeto
                this.getSiguienteManejador().comprobar(art);
            }
        }
    }
}
