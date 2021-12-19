package finalBarco;

public class Test {
    public static void main(String[] args) {
        Barcox b1= new Barcox("Capitan-Alexis");
        Carga c1= FabricaCarga.getInstance().crearCargas("Simple");
        Carga c2= FabricaCarga.getInstance().crearCargas("Simple");
        Carga ct3= FabricaCarga.getInstance().crearCargas("Contenedor");

        c1.setNombre("TV 32 LCD");
        c1.setDescripcion("TV 32");
        ((SimpleC)c1).setPesoCargaSimple(3);
        ((SimpleC)c1).setRefrigerado(false);

        c2.setNombre("Caja de medicamentos");
        c2.setDescripcion("Medicamentos");
        ((SimpleC)c2).setPesoCargaSimple(2);
        ((SimpleC)c2).setRefrigerado(true);

        ct3.setNombre("Contenedor tv y medicamentos");
        ((Contenedor)ct3).agregarCargas(c1);
        ((Contenedor)ct3).agregarCargas(c2);
        ((Contenedor)ct3).setPesoContenedor(100);


        b1.agregarCarga(c1);
        b1.agregarCarga(c2);
        b1.agregarCarga(ct3);
        b1.mostrarCarga();
    }
}
