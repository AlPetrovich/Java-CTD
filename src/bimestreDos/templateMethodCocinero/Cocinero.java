package templateMethodCocinero;

public abstract class Cocinero {
    void hacerPizza(){
        prepararMasa();
        preCocinarMasa();
        prepararIngredientes();
        agregarIngredientes();
        cocinarPizza();
        empaquetarPizza();
    }
    protected abstract void prepararIngredientes();
    protected abstract void agregarIngredientes();
    private void prepararMasa(){
        System.out.println("Preparando masa...");
    }
    private void preCocinarMasa(){
        System.out.println("Pre cocinando masa...");
    }
    private void cocinarPizza(){
        System.out.println("Enviando pizza al horno");
    }
    private void empaquetarPizza(){
        System.out.println("Empaquetando pizza");
    }

}
