package bimestreTres.proxyInternet;

//Definimos el servicio que nos conecta a internet
public class InternetService implements IConexionInternet{
    @Override
    public void conectarCon(String url) {
        System.out.println("Conectando con "+ url);
    }
}
