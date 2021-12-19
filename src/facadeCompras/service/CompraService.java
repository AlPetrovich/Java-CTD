package facadeCompras.service;
import facadeCompras.model.Direccion;
import facadeCompras.model.Producto;
import facadeCompras.model.Tarjeta;

import java.util.Arrays;
import java.util.List;

public class CompraService implements ICompraService{
    private AlmacenService almacenService;
    private PagoService pagoService;
    private EnvioService envioService;

    public CompraService(AlmacenService almacenService, PagoService pagoService, EnvioService envioService) {
        this.almacenService = almacenService;
        this.pagoService = pagoService;
        this.envioService = envioService;
    }

    @Override
    public void procesarCompra(String productoId, Integer cantidad, Tarjeta tarjeta, List<Direccion> direccion) {
        Producto producto= almacenService.buscarProducto(productoId,cantidad);
        if (producto != null){
            if (pagoService.procesarPago(tarjeta, String.valueOf(producto.getValor()*cantidad))){
                envioService.procesarEnvio(Arrays.asList(producto), (Direccion) direccion);
            }
        }
    }
}
