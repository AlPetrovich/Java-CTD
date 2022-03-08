package bimestreTres.proxyInternet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> sitiosBloqueados = new ArrayList<>();
        sitiosBloqueados.add("www.youtube.com");
        sitiosBloqueados.add("www.facebook.com");
        sitiosBloqueados.add("www.facebook.com");

        IConexionInternet proxy;

        proxy = new ProxyInternet(sitiosBloqueados, new InternetService());

        proxy.conectarCon("www.google.com");
        proxy.conectarCon("www.youtube.com");
    }
}
