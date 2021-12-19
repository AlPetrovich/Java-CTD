package templateMFastfood;

import templateMFastfood.procesadorMenues.ProcesadorDeMenuAdulto;
import templateMFastfood.procesadorMenues.ProcesadorDeMenuInfantil;
import templateMFastfood.procesadorMenues.ProcesadorDeMenuVegetariano;
import templateMFastfood.procesadorMenues.ProcesadorDeMenus;

public class Main {
    public static void main(String[] args) {
        ProcesadorDeMenus procesadorDeMenusAdulto = new ProcesadorDeMenuAdulto();
        ProcesadorDeMenus procesadorDeMenusInfantil = new ProcesadorDeMenuInfantil();
        ProcesadorDeMenus procesadorDeMenusVeggie = new ProcesadorDeMenuVegetariano();

        procesadorDeMenusAdulto.procesarMenu();
        procesadorDeMenusInfantil.procesarMenu();
        procesadorDeMenusVeggie.procesarMenu();
    }
}
