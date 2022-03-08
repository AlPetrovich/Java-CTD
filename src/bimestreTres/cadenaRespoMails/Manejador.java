package bimestreTres.cadenaRespoMails;

public abstract class Manejador {

    protected Manejador siguienteManejador;

    public Manejador getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(Manejador m) {
        this.siguienteManejador = m;
    }

    public abstract void comprobarMail(Email email);
}
