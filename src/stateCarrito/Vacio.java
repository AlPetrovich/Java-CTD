package stateCarrito;

public class Vacio implements EstadosCarrito{
    private Carrito c;


    public Vacio(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No se pueden agregar productos en estado vacio");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("No se puede cancelar en estado vacio");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("Vacio, no se puede volver al punto anterior");
    }

    @Override
    public void pasarSigEstado() {
        System.out.println("Pasando de vacio a cargando");

    }
}
