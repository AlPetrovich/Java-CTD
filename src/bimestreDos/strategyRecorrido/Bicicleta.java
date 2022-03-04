package strategyRecorrido;



public class Bicicleta implements EstrategiaTransporte{

    @Override
    public double calcularMinutos(Punto origen, Punto destino) {
        return origen.calcularDistancia(destino)/ 0.050366 * 1.5;
    }
}
