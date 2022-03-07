package bimestreTres.cadenaRespGobierno;

public class Presidente extends Jerarca{

    public Presidente(Jerarca siguienteJerarca) {
        super(siguienteJerarca);
    }

    public Presidente() {
        super();
    }

    @Override
    public void leer(Documento documento) {
        documento.leer(this);
        if (siguienteJerarca != null){
            siguienteJerarca.leer(documento);
        }
    }
}
