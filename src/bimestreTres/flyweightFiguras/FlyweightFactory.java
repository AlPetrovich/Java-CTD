package bimestreTres.flyweightFiguras;

import java.util.HashMap;

public class FlyweightFactory {
    //static-final es la referencia, podemos agregar o quitar cosas del map
    private static final HashMap<String , Circulo> circuloMap = new HashMap<>();

    //parametro es el compartido
    public static Circulo obtenerCirculo(String color){
        Circulo circulo = circuloMap.get(color);
        if (circulo == null){
            circulo = new Circulo(color); //creo un circulo con el color que viene por parametro
            circuloMap.put(color,circulo); //agrego al mapa para reutlizarlo
            System.out.println("Creo un circulo de color: " + color);
        }
        return circulo;
    }
}
