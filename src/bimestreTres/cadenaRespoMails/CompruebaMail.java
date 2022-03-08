package bimestreTres.cadenaRespoMails;

public class CompruebaMail
{
    Manejador inicial;

    public CompruebaMail() {
        this.inicial = new ManejadorGerencia();
        Manejador tecnica = new ManejadorTecnico();
        Manejador comercial = new ManejadorComercial();
        Manejador spam = new ManejadorSpam();

        inicial.setSiguienteManejador( comercial );
        comercial.setSiguienteManejador( tecnica );
        tecnica.setSiguienteManejador( spam );
    }

    public void comprobar(Email  email)
    {
        inicial.comprobarMail( email );
    }
}

