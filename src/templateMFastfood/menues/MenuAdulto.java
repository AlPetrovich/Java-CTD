package templateMFastfood.menues;

public class MenuAdulto extends Menu{
    private String oferta;

    public MenuAdulto(double precioBase, String oferta) {
        super(precioBase);
        this.oferta = oferta;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Menu Adulto oferta: "+oferta+" Precio base: $"+getPrecioBase());
    }
}
