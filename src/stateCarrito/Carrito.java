package stateCarrito;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private EstadosCarrito estado;
    private List<Producto> productos;

    public Carrito(){
        this.productos=new ArrayList<>();
        setEstado(new Vacio(this));
    }

    public void agregarProducto(Producto p){
        getEstado().agregarProducto(p);
    }
    public void cancelarCarrito(){
        getEstado().cancelarCarrito();
    }

    public void volverPuntoAnterior(){
        getEstado().volverPuntoAnterior();
    }

    public void pasarSigEstado(){
        getEstado().pasarSigEstado();
    }

    public EstadosCarrito getEstado() {
        return estado;
    }

    public void setEstado(EstadosCarrito estado) {
        this.estado = estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
