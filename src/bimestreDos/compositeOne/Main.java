package bimestreDos.compositeOne;
public class Main {
    public static void main(String[] args) {
        Comestible c1 = new Comestible("Hamburguesa",500);
        Comestible c2 = new Comestible("SuperPancho",300);
        Comestible c3 = new Comestible("Oreo",200);
        Comestible c4 = new Comestible("Papas fritas",100);
        Comestible c5 = new Comestible("Ensalada",300);

        Combo combo1= new Combo("Promo Halloween");
        combo1.addElemento(c1);
        combo1.addElemento(c5);

        Combo combo2 = new Combo("Salchipapa");
        combo2.addElemento(c2);
        combo2.addElemento(c4);

        Combo carrito = new Combo("Carrito B");
        carrito.addElemento(combo1);
        carrito.addElemento(c3);

        System.out.println("Total del carrito: "+ carrito.calcularPrecio());
    }
}
