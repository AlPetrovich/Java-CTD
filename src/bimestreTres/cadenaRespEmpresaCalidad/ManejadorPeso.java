package bimestreTres.cadenaRespEmpresaCalidad;

public class ManejadorPeso extends Manejador{


    @Override
    public void comprobar(Articulo art) {
        if ((art.getPeso() < 1000) || (art.getPeso()> 1500)){
            System.out.println("Rechazado por peso");
        }else{
            if (this.getSiguienteManejador() != null){
                //LLamamos al meotodo en el siguiente objeto
                this.getSiguienteManejador().comprobar(art);
            }
        }
    }
}
