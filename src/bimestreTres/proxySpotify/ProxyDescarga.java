package bimestreTres.proxySpotify;

public class ProxyDescarga implements DescargaSpotify{

    private ServicioDescarga servicioDescarga = new ServicioDescarga();

    private boolean esUsuarioPremium(Usuario usuario){
        return usuario.getTipoUsuario().equalsIgnoreCase("premium");
    }

    @Override
    public void descargar(Usuario usuario, String cancion) {
        if (esUsuarioPremium(usuario)){
            servicioDescarga.descargar(usuario,cancion);
        }else {
            System.out.println("El usuario ID: "+ usuario.getId()+" no puede descargar "+ cancion+" ya que no tiene cuenta premium");
        }
    }
}
