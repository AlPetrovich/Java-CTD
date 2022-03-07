package bimestreTres.flyweightListaCanciones;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory listaReproduccion = new FlyweightFactory("MILISTA");

        listaReproduccion.agregar("Cancion1", "Artista1", "Genero1");
        listaReproduccion.agregar("Cancion2", "Artista2", "Genero2");
        listaReproduccion.agregar("Cancion1", "Artista1", "Genero1");
        listaReproduccion.agregar("Cancion1", "Artista2", "Genero2");
        listaReproduccion.agregar("Cancion3", "Artista3", "Genero3");
        listaReproduccion.agregar("Cancion1", "Artista1", "Genero1");
        listaReproduccion.mostrarCanciones();

        listaReproduccion.eliminar("Cancion1","Artista1","Genero1");
        listaReproduccion.mostrarCanciones();

    }
}