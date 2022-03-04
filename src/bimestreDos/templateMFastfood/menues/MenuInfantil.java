package templateMFastfood.menues;

public class MenuInfantil extends Menu{
    private String sorpresa;
    private double costoSorpresa;

    public MenuInfantil(double precioBase, String sorpresa, double costoSorpresa) {
        super(precioBase);
        this.sorpresa = sorpresa;
        this.costoSorpresa = costoSorpresa;
    }

    public String getSorpresa() {
        return sorpresa;
    }

    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    public double getCostoSorpresa() {
        return costoSorpresa;
    }

    public void setCostoSorpresa(double costoSorpresa) {
        this.costoSorpresa = costoSorpresa;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Menu infantil sorpresa: "+sorpresa+" Precio sopresa: "+costoSorpresa+" Precio base: $"+getPrecioBase());
    }
}
