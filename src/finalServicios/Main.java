package finalServicios;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("TecnoPOO");
        ServicioBrindado ventaAire= FabricaServicio.getInstance().crearServicio("Simple");
        ServicioBrindado colocacion= FabricaServicio.getInstance().crearServicio("Simple");
        ServicioBrindado combo= FabricaServicio.getInstance().crearServicio("Combo");

        ventaAire.setNombre("Venta de aire acondicionado");
        ventaAire.setDescripcion("Venta de aire acondicionado");
        ((Simple) ventaAire).setPrecio(65000);

        colocacion.setNombre("Colocacion");
        colocacion.setDescripcion("Colocación de aire acondicionado");
        ((Simple) colocacion).setPrecio(10000);

        combo.setNombre("Venta + colocacion");
        combo.setDescripcion("Venta mas colocacion de aire acondicionado");
        ((Combo)combo).setDescuento(0.1);
        ((Combo)combo).agregarServicioBrindado(ventaAire);
        ((Combo)combo).agregarServicioBrindado(colocacion);

        empresa.agregarServicios(ventaAire);
        empresa.agregarServicios(colocacion);
        empresa.agregarServicios(combo);
        empresa.mostrarServicios();
    }
}
