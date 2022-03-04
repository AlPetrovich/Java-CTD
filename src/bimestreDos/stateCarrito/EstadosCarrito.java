package stateCarrito;

public interface EstadosCarrito {
    public void agregarProducto(Producto c);
    public void cancelarCarrito();  //vuelve a estar vacio
    public void volverPuntoAnterior();  //salvo que este cerrado
    public void pasarSigEstado();  //en el caso de cerrado vuelve a vacio
}
