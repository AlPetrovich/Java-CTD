package bimestreDos.observerOro;

public interface Observable {

    void agregar(Observador o);
    void quitar(Observador o);
    void notificar(String cambio);
}
