package bimestreTres.flyweightComputadoras;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {


    private static Map<String, Computadora> macLigeros= new HashMap<>();

    public Computadora getComputadora(int ram, int disco){
        String clave = "key: "+ ram+":"+disco;
        System.out.println(clave);

        if (!macLigeros.containsKey(clave)){
            macLigeros.put(clave, new Computadora(ram, disco));
            System.out.println("PC creada");
            return macLigeros.get(clave);
        }
        System.out.println("PC obtenida");
        return macLigeros.get(clave);
    }
}
