package bimestreDos.finalBarco;

public class SimpleC extends Carga{
    private double pesoCargaSimple;
    private boolean refrigerado;

    @Override
    public double calcularPeso() {
        if (isRefrigerado()){
            return pesoCargaSimple*1.1;
        }
        return pesoCargaSimple;
    }

    @Override
    public String toString() {
        return "Carga Simple: "+ getNombre()+" Peso: "+ getPesoCargaSimple()+" Refrigerado: "+ isRefrigerado();
    }

    public double getPesoCargaSimple() {
        return pesoCargaSimple;
    }

    public void setPesoCargaSimple(double pesoCargaSimple) {
        this.pesoCargaSimple = pesoCargaSimple;
    }

    public boolean isRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }
}
