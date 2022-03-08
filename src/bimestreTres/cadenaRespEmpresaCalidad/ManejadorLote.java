package bimestreTres.cadenaRespEmpresaCalidad;

public class ManejadorLote extends Manejador{


    @Override
    public void comprobar(Articulo art) {
        if ((art.getLote() < 1000) || (art.getLote()>2000)){
            System.out.println("Rechazado por lote");
        }else{
            if (this.getSiguienteManejador() != null){
                //LLamamos al meotodo en el siguiente objeto
                this.getSiguienteManejador().comprobar(art);
            }
        }
    }
}
