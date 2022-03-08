package bimestreTres.cadenaRespoMails;

public class ManejadorTecnico extends Manejador{

    @Override
    public void comprobarMail(Email email) {
        if ((email.getDestino().equalsIgnoreCase("tecnica@digitalhouse.com")) ||
                (email.getTema().equalsIgnoreCase("tecnica")))
        {
            System.out.println("Enviando a tecnica");
        }else{
            if (this.getSiguienteManejador() != null){
                this.getSiguienteManejador().comprobarMail(email);
            }
        }
    }
}
