package parcial02Mio;

public class Casa extends Proyecto{
    private double superficieTerreno;
    private int cantidadBanios;
    private int cantidadDormitorios;

    public Casa(Construccion construccion, int idProyecto, String nombreProyecto, String ciudadProyecto, String estatus, double superficieTerreno, int cantidadBanios, int cantidadDormitorios) {
        super(construccion, idProyecto, nombreProyecto, ciudadProyecto, estatus);
        this.superficieTerreno = superficieTerreno;
        this.cantidadBanios = cantidadBanios;
        this.cantidadDormitorios = cantidadDormitorios;
    }
}
