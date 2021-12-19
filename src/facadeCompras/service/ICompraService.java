package facadeCompras.service;

import facadeCompras.model.Direccion;
import facadeCompras.model.Tarjeta;
import java.util.List;

public interface ICompraService {
    void procesarCompra(String productoId, Integer cantidad, Tarjeta tarjeta, List<Direccion> direccion);
}
