package bimestreTres.proxySpotify;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioPremium = new Usuario(213,"Premium");
        Usuario usuarioFree = new Usuario(123,"Free");
        ProxyDescarga proxyDescarga = new ProxyDescarga();

        proxyDescarga.descargar(usuarioPremium, "Elegante 420");
        proxyDescarga.descargar(usuarioFree,"We Will Rock you");
    }
}
