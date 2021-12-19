package finalBarco;

public class FabricaCarga {
    private static FabricaCarga instance;
    private FabricaCarga(){

    }
    public static FabricaCarga getInstance(){
        if (instance==null){
            instance= new FabricaCarga();
        }
        return instance;
    }

    public Carga crearCargas(String tipo){
        switch (tipo){
            case "Simple":
                return new SimpleC();
            case "Contenedor":
                return new Contenedor();
            default:
                return null;
        }
    }
}
