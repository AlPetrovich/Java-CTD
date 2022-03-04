package bimestreDos.finalPizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{
    private List<Pizza> pizzas= new ArrayList<>();


    @Override
    public double calcularPrecio() {
        double total=0;
        for (Pizza pi: pizzas){
            total+= pi.calcularPrecio()/2;
        }
        return total;
    }

    @Override
    public String toString() {
        String pizzasStr="";
        for (Pizza pi: pizzas){
            pizzasStr+="\t* "+ pi.toString();
        }
        return "Combo: "+getNombre()+" Descripcion: "+ getDescripcion()+" Precio: $"+ this.calcularPrecio();
    }


    public void agregarPizzas(Pizza pi){
        pizzas.add(pi);
    }
}
