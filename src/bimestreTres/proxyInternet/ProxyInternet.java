package bimestreTres.proxyInternet;

import java.util.List;

//Clase proxy realiza lo mismo que el servicio internet pero con logica extra
public class ProxyInternet implements IConexionInternet{

    private InternetService internetService;
    private List<String> sitiosBloqueados;

    @Override
    public void conectarCon(String url) {
        //si la url no esta en la liste de los bloqueados entonces conecto
        if (!this.sitiosBloqueados.contains(url)){
            internetService.conectarCon(url);
        }else{
            System.out.println("Acceso denegado");
        }
    }

    //Constructor
    public ProxyInternet(List<String> sitiosBloqueados,InternetService internetService) {
        this.internetService = internetService;
        this.sitiosBloqueados = sitiosBloqueados;
    }
}
