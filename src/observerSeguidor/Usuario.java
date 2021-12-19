package observerSeguidor;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Sujeto{
    private String nombre;
    private String apellido;
    private boolean fotoSubida;
    private List<Observador> seguidores;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fotoSubida =false;
        this.seguidores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isFotoSubida() {
        return fotoSubida;
    }

    public void setFotoSubida(boolean fotoSubida) {
        this.fotoSubida = fotoSubida;
    }

    public List<Observador> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(List<Observador> seguidores) {
        this.seguidores = seguidores;
    }

    @Override
    public void agregar(Observador obs) {
        seguidores.add(obs);
    }

    @Override
    public void eliminar(Observador obs) {
        seguidores.remove(obs);
    }

    @Override
    public void notificar() {
        for (Observador obs: seguidores){
            obs.actualizar("Fue notificada la foto que subio "+ nombre);
        }
    }
    public void controlSubida(){
        if (fotoSubida==true){
            notificar();
        }
    }
}
