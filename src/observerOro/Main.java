package observerOro;

public class Main {
    public static void main(String[] args) {
        Pizarra pizarra= new Pizarra();
        Observador obs1= new Oro();
        Observador obs2= new Oro();

        pizarra.agregar(obs1);
        pizarra.agregar(obs2);

        pizarra.cambiarPrecio(44);
        pizarra.cambiarPrecio(50);
        pizarra.cambiarPrecio(90);

    }
}
