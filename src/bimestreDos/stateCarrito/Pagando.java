package stateCarrito;

import java.util.List;

public class Pagando implements EstadosCarrito{
    private Carrito c;
    private List<Producto> producto;

    public Pagando(Carrito c) {
        this.c = c;
        this.producto = producto;
    }

    @Override
    public void agregarProducto(Producto c) {
        //nada
    }

    @Override
    public void cancelarCarrito() {
        c.setEstado(new Vacio(c));
    }

    @Override
    public void volverPuntoAnterior() {
        c.setEstado(new Cargando(c));
    }

    @Override
    public void pasarSigEstado() {
        c.setEstado(new Cerrado(c));
    }
}
