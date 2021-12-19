package stateCarrito;

import java.util.List;

public class Cerrado implements EstadosCarrito{
    private Carrito c;
    private List<Producto> producto;

    public Cerrado(Carrito c) {
        this.c = c;
        this.producto = producto;
    }

    @Override
    public void agregarProducto(Producto c) {
        //nADA
    }

    @Override
    public void cancelarCarrito() {
     c.setEstado(new Vacio(c));
    }

    @Override
    public void volverPuntoAnterior() {
        //nada
    }

    @Override
    public void pasarSigEstado() {
        //nada
    }
}
