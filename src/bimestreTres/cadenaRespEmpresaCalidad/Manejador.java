package bimestreTres.cadenaRespEmpresaCalidad;

public abstract class Manejador {

    protected Manejador siguienteManejador;

    public Manejador getSiguienteManejador(){
        return this.siguienteManejador;
    }

    public void setSiguienteManejador(Manejador m){
        this.siguienteManejador = m;
    }

    public abstract void comprobar(Articulo art);
}
