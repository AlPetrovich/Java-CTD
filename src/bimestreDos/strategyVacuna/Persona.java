package strategyVacuna;

public class Persona {
    private String nombre;
    private int cantidadDosisDadas;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cantidadDosisDadas = 0;
    }

    public void incrementarDosis(){
        cantidadDosisDadas++;
    }

    public int cantidadDosisDadas(){
        return cantidadDosisDadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setCantidadDosisDadas(int cantidadDosisDadas) {
        this.cantidadDosisDadas = cantidadDosisDadas;
    }
}
