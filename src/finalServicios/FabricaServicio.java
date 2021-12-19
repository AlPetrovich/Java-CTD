package finalServicios;



public class FabricaServicio {
    private static FabricaServicio instance;


    private FabricaServicio(){

    }
    public static FabricaServicio getInstance(){
        if (instance==null){
            instance= new FabricaServicio();
        }
        return instance;
    }
    public ServicioBrindado crearServicio(String tipo){
        switch (tipo){
            case "Simple":
                return new Simple();
            case "Combo":
                return new Combo();
            default:
                return null;
        }
    }
}
