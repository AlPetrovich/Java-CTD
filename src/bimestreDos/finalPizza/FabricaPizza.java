package bimestreDos.finalPizza;

import java.util.List;

public class FabricaPizza {
    private static FabricaPizza instancia;
    private List<Pizza> pizzas;

    private FabricaPizza(){

    }
    public static FabricaPizza getInstancia(){
        if (instancia==null){
            instancia= new FabricaPizza();
        }
        return instancia;
    }

    public Pizza crearPizza(String tipo){
        switch (tipo){
            case "Simple":
                return new PizzaSimple();
            case "Combinada":
                return new PizzaCombinada();
            default:
                return null;
        }
    }
}
