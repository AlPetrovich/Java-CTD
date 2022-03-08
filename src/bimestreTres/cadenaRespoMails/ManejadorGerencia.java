package bimestreTres.cadenaRespoMails;

public class ManejadorGerencia extends Manejador{

    @Override
    public void comprobarMail(Email email) {
        if ((email.getDestino().equalsIgnoreCase("gerencia@colmena.com")) ||
                (email.getTema().equalsIgnoreCase("gerencial")))
        {
            System.out.println("Enviado a gerencia");
        }else{
            if (this.getSiguienteManejador() != null){
                this.getSiguienteManejador().comprobarMail(email);
            }
        }
    }
}
