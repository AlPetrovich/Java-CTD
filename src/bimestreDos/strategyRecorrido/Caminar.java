package strategyRecorrido;



public class Caminar implements EstrategiaTransporte{

    @Override
    public double calcularMinutos(Punto origen, Punto destino) {
        return origen.calcularDistancia(destino)/0.20366 * 13;
    }
}
