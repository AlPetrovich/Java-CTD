package strategyRecorrido;


public class Auto implements EstrategiaTransporte{

    @Override
    public double calcularMinutos(Punto origen, Punto destino) {
        return origen.calcularDistancia(destino) / 0.40366 * 4;
    }
}
