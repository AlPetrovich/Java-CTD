package templateMFastfood.procesadorMenues;

import templateMFastfood.menues.Menu;
import templateMFastfood.menues.MenuAdulto;

public class ProcesadorDeMenuAdulto extends ProcesadorDeMenus{

    @Override
    protected Menu armar() {
        Menu menu= new MenuAdulto(500,"Bife de chorizo con papas");
        return menu;
    }

    @Override
    protected double calcularPrecioVenta(Menu menu) {
        return menu.getPrecioBase();
    }
}
