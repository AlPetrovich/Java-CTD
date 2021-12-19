package finalPizza;


public class Test {
    public static void main(String[] args) {
        Pizzeria pizzeria= new Pizzeria("AWS--");
        Pizza p1= FabricaPizza.getInstancia().crearPizza("Simple");
        Pizza p2= FabricaPizza.getInstancia().crearPizza("Simple");
        Pizza p3= FabricaPizza.getInstancia().crearPizza("Simple");
        Pizza p4= FabricaPizza.getInstancia().crearPizza("Combinada");

        //primera
        p1.setNombre("Muzarrella chica");
        p1.setDescripcion("Muzarella chica");
        ((PizzaSimple)p1).setTamanio("chica");
        ((PizzaSimple)p1).setPrecioBase(700);
        //segunda
        p2.setNombre("Especial chica");
        p2.setDescripcion("Especial chica");
        ((PizzaSimple)p2).setTamanio("chica");
        ((PizzaSimple)p2).setPrecioBase(850);
        //tercera
        p3.setNombre("Anana chica");
        p3.setDescripcion("Anana chica");
        ((PizzaSimple)p3).setTamanio("chica");
        ((PizzaSimple)p3).setPrecioBase(950);
        //combo loco
        p4.setNombre("Pizza combinada loca");
        p4.setDescripcion("Pizza combinada especial y anana");
        ((PizzaCombinada)p4).agregarPizzas(p2);
        ((PizzaCombinada)p4).agregarPizzas(p3);

        pizzeria.agregarPizzas(p1);
        pizzeria.agregarPizzas(p2);
        pizzeria.agregarPizzas(p3);
        pizzeria.agregarPizzas(p4);

        pizzeria.MostrarPizzas();

    }
}
