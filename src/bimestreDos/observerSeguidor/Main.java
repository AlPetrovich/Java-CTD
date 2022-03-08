package bimestreDos.observerSeguidor;

public class Main {
    public static void main(String[] args) {
        Usuario jorge= new Usuario("Jorge","Perez");
        Seguidor juan= new Seguidor("Juan","Perez");

        jorge.agregar(juan);
        jorge.notificar();
        jorge.setFotoSubida(true);
        jorge.notificar();

        System.out.println("Cantidad de notificacion de juan: "+ juan.getCantNotificacion());
    }
}
