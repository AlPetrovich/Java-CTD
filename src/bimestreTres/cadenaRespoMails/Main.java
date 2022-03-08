package bimestreTres.cadenaRespoMails;

public class Main {
    public static void main(String[] args) {
        CompruebaMail proceso = new CompruebaMail();
        proceso.comprobar(new Email("mio@mail.com", "tecnica@digitalhouse.com","reclamo"));
        proceso.comprobar(new Email("mio@mail.com", "sds@digitalhouse.com","gerencia"));
        proceso.comprobar(new Email("mio@mail.com", "juan@pepe.com","comercial"));
        proceso.comprobar(new Email("mio@mail.com", "qqq@digitalhouse.com","reclamo"));

    }
}
