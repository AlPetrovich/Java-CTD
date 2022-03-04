package strategyRecorrido;

public class Transporte {
    private EstrategiaTransporte tipoDeTransporte;


    public Transporte(EstrategiaTransporte tipoDeTransporte){
        this.tipoDeTransporte=tipoDeTransporte;
    }
    double calcularMinutos(Punto origen, Punto destino){
        return tipoDeTransporte.calcularMinutos(origen,destino);
    }
}
