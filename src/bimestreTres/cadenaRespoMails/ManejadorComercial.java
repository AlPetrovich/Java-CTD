package bimestreTres.cadenaRespoMails;

public class ManejadorComercial extends Manejador{


    @Override
    public void comprobarMail(Email email) {
        if ((email.getDestino().equalsIgnoreCase("comercial@colmena.com")) ||
                (email.getTema().equalsIgnoreCase("comercial")))
        {
            System.out.println("Enviando a comercial");
        }else
        {
            if (this.getSiguienteManejador() != null){
                this.getSiguienteManejador().comprobarMail(email);
            }
        }
    }
}
