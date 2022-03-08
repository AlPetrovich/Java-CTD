package bimestreTres.cadenaRespoMails;

public class ManejadorSpam  extends Manejador{

    @Override
    public void comprobarMail(Email email) {
        System.out.println("Marcado como span");
    }
}
