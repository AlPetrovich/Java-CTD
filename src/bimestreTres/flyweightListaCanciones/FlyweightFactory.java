package bimestreTres.flyweightListaCanciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {

    private final String nombre;
    private final Map<CancionKey, Cancion> mapaCanciones;
    private final List<Cancion> listaCanciones;

    public FlyweightFactory(String nombre) {
        this.nombre = nombre;
        this.mapaCanciones = new HashMap<>();
        this.listaCanciones = new ArrayList<>();
    }

    private Cancion obtenerCancion(String nombre, String artista, String genero){
        CancionKey key = new CancionKey(nombre, artista, genero);
        Cancion cancion = mapaCanciones.get(key);
        if (cancion == null){
            cancion = new Cancion(nombre, artista , genero);
            mapaCanciones.put(key,cancion);
            System.out.println("Creando cancion...");
        }else{
            System.out.println("Obteniendo cancion existente...");
        }
        cancion.mostrarInformacion();
        return cancion;
    }

    public void agregar(String nombre, String artista, String genero){
        System.out.println("Agregando cancion...");
        Cancion cancion = this.obtenerCancion(nombre, artista, genero);
        listaCanciones.add(cancion);
    }

    public void eliminar(String nombre, String artista, String genero){
        System.out.println("Eliminando cancion...");
        Cancion cancion = this.obtenerCancion(nombre, artista, genero);
        mapaCanciones.remove(cancion);
        listaCanciones.remove(cancion);
    }
    public Cancion obtener(String nombre, String artista, String genero) {
        return this.obtenerCancion(nombre, artista, genero);
    }

    public void mostrarCanciones() {
        System.out.println("\n\nLista de reproducción: " + nombre);
        for (Cancion cancion : listaCanciones) {
            cancion.mostrarInformacion();
        }
    }
}
