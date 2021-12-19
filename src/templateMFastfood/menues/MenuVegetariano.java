package templateMFastfood.menues;

public class MenuVegetariano extends Menu{
    private String condimento;

    public MenuVegetariano(double precioBase, String condimento) {
        super(precioBase);
        this.condimento = condimento;
    }

    public String getCondimento() {
        return condimento;
    }

    public void setCondimento(String condimento) {
        this.condimento = condimento;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Menu vegetariano: "+ condimento+" Precio base: "+ getPrecioBase());
    }
}
