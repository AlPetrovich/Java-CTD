package templateMFastfood.procesadorMenues;

import templateMFastfood.menues.Menu;
import templateMFastfood.menues.MenuVegetariano;

public class ProcesadorDeMenuVegetariano extends ProcesadorDeMenus{
    @Override
    protected Menu armar() {
        Menu menu= new MenuVegetariano(100,"Queso extra");
        return menu;
    }

    @Override
    protected double calcularPrecioVenta(Menu menu) {
        return menu.getPrecioBase()*1.1;
    }
}
