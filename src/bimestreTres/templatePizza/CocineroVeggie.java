package bimestreTres.templatePizza;

public class CocineroVeggie extends Cocinero{


    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando tomate y queso de mani");
    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando ingredientes a la pizza vegana");
    }
}
