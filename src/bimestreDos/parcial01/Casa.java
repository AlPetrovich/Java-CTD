package parcial01;

public class Casa extends Proyecto {
    private Integer supercieTerreno;
    private Integer cantidadBanios;
    private Integer cantidadDormitorios;

    public Casa(Integer numeroProyecto, String nombreProyecto, String ciudadProyecto, String estatus, Contruccion contruccion, Integer supercieTerreno, Integer cantidadBanios, Integer cantidadDormitorios) {
        super(numeroProyecto, nombreProyecto, ciudadProyecto, estatus, contruccion);
        this.supercieTerreno = supercieTerreno;
        this.cantidadBanios = cantidadBanios;
        this.cantidadDormitorios = cantidadDormitorios;
    }
}
