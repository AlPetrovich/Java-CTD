package bimestreTres.cadenaRespGobierno;

public class Diputado extends Jerarca{

    public Diputado(Jerarca siguienteJerarca) {
        super(siguienteJerarca);
    }

    public Diputado() {
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
