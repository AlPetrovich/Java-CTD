package stateCarrito;

import java.util.ArrayList;
import java.util.List;

public class Cargando implements EstadosCarrito{
    private Carrito c;
    private List<Producto> producto;

    public Cargando(Carrito c) {
        this.c = c;
        this.producto = new ArrayList<>();
    }

    @Override
    public void agregarProducto(Producto producto) {
        this.producto.add(producto);
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("Cargando uso cancelar");
        c.setEstado(new Vacio(c));
        producto.clear();
    }

    @Override
    public void volverPuntoAnterior() {
        c.setEstado(new Vacio(c));
    }

    @Override
    public void pasarSigEstado() {
        c.setEstado(new Pagando(c));
    }
}
