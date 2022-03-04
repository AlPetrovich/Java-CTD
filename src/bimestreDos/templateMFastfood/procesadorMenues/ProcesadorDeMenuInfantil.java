package templateMFastfood.procesadorMenues;

import templateMFastfood.menues.Menu;
import templateMFastfood.menues.MenuInfantil;

public class ProcesadorDeMenuInfantil extends ProcesadorDeMenus{

    @Override
    protected Menu armar() {
        Menu menu= new MenuInfantil(150,"Capitan America",350);
        return menu;
    }

    @Override
    protected double calcularPrecioVenta(Menu menu) {
        return menu.getPrecioBase()+ ((MenuInfantil)menu).getCostoSorpresa();
    }
}
