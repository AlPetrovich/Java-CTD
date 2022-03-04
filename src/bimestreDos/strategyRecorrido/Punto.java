package strategyRecorrido;

public class Punto {
    private double latitud;
    private double longitud;

    public Punto(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double calcularDistancia(Punto pnt){
        return Math.abs(this.latitud- pnt.latitud)+ Math.abs(this.longitud-pnt.latitud);
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
