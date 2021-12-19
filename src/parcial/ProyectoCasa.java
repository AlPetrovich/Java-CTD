package parcial;

public class ProyectoCasa extends Proyecto{
    private Double superfieTerreno;
    private Integer cantidadBanios;
    private Integer cantidadDormitorios;

    public ProyectoCasa(Construccion construccion, Integer numeroIdentificacion, String nombre, String ciudad, String estatus, Double superfieTerreno, Integer cantidadBanios, Integer cantidadDormitorios) {
        super(construccion, numeroIdentificacion, nombre, ciudad, estatus);
        this.superfieTerreno = superfieTerreno;
        this.cantidadBanios = cantidadBanios;
        this.cantidadDormitorios = cantidadDormitorios;
    }
}
