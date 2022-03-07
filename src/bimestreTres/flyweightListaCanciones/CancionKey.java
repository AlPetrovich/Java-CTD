package bimestreTres.flyweightListaCanciones;

import java.util.Objects;

public class CancionKey {

    private String nombre;
    private String artista;
    private String genero;


    public CancionKey(String nombre, String artista, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CancionKey)) return false;
        CancionKey that = (CancionKey) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(artista, that.artista) && Objects.equals(genero, that.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, artista, genero);
    }
}
