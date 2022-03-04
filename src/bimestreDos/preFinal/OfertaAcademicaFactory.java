package preFinal;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instance;  //primero el objeto propio en la misma clase.

    private OfertaAcademicaFactory(){   //constructor privado entonces nadie mas puede crear una instancia de la clase solo la misma clase

    }

    public static OfertaAcademicaFactory getInstance(){
        if (instance==null){
            instance= new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica crearOfertaAcademica(String tipo){
        switch (tipo){
            case "Curso":
                return new Curso();
            case "ProgramaIntensivo":
                return new ProgramaIntensivo();
            case "Taller":
                return new Taller();
            case "Carrera":
                return new Carrera();
            default:
                return null;
        }
    }

}
