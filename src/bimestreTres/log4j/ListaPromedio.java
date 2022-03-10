package bimestreTres.log4j;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaPromedio {

    private static final Logger logger = Logger.getLogger(ListaPromedio.class);

    private List<Integer> enteros = new ArrayList<>();

    public ListaPromedio(List<Integer> enteros) throws Exception{
            this.enteros=enteros;
            if (enteros.size()>5){
                logger.info("La longitud de la lista es mayor a 5");
            }
            if (enteros.size() >10){
                logger.info("La longitud de la lista es mayor a 10");
            }

            if (enteros.size() == 0){
                throw new Exception();
            }
    }

    public int promedioDos() {
        int sum = 0;
        for (Integer entero: enteros) {
            sum = sum + entero;
        }
        int promedio = sum / enteros.size();
        logger.info("El promedio de la lista es: " + promedio);
        return promedio;
    }

    public int promedio(){
        int sum = 0;
        Integer entero;
        for (Iterator var2 = this.enteros.iterator(); var2.hasNext(); sum+= entero){
            entero = (Integer)var2.next();
        }
        int promedio = sum / this.enteros.size();
        logger.info("El promedio de la lista es: " + promedio);
        return promedio;
    }

    public List<Integer> getEnteros(){
        return this.enteros;
    }
}
