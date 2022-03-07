package bimestreTres.cadenaRespGobierno;

public abstract class Jerarca {


    protected Jerarca siguienteJerarca;

    // 1 - Metodo abstracto de procesamiento
    public abstract void leer(Documento documento);

    //Constructor All arguments
    public Jerarca(Jerarca siguienteJerarca) {
        this.siguienteJerarca = siguienteJerarca;
    }

    //Constructor vacio
    public Jerarca(){
        this.siguienteJerarca = null;
    }

}
