package preFinal2;

public class FabricaOfertaAcademica {
    private static FabricaOfertaAcademica instance;

    private FabricaOfertaAcademica(){

    }
    public static FabricaOfertaAcademica getInstance(){
        if (instance==null){
            instance=new FabricaOfertaAcademica();
        }
        return instance;
    }
    public OfertaAcademica crearOfertaAcademica(String tipo){
        switch (tipo){
            case "Curso":
                return new Curso();
            case "Programa":
                return new Programa();
            case "Taller":
                return new Taller();
            case "Carrera":
                return new Carrera();
            default:
                return null;
        }
    }
}
