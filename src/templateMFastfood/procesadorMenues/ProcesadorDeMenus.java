package templateMFastfood.procesadorMenues;

import templateMFastfood.menues.Menu;

public abstract class ProcesadorDeMenus {
    public void procesarMenu(){
        Menu menu= armar();
        double precio= calcularPrecioVenta(menu);
        menu.mostrarInformacion();
        System.out.println("Precio final: "+precio);

    }
    protected abstract Menu armar();
    protected abstract double calcularPrecioVenta(Menu menu);
}
