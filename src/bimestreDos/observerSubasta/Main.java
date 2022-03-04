package observerSubasta;

public class Main {
    public static void main(String[] args) {
        Subasta subasta= new Subasta(200,"Subasta autos");
        Oferente oferente1 = new Oferente("Juan ", "Vera", "152455", 500d);
        Oferente oferente2 = new Oferente("Lucas ", "Olaya", "152455", 300d);

        subasta.agregarObservador(oferente1);
        subasta.agregarObservador(oferente2);


        subasta.iniciarSubasta();

    }
}
