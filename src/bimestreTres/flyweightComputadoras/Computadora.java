package bimestreTres.flyweightComputadoras;

public class Computadora {

    private int id;
    private int ram;
    private int disco;
    private static int contador;

    public Computadora(int ram, int disco) {
        this.ram = ram;
        this.disco = disco;
        contador++;
        System.out.println("contador: " + contador);
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "id='" + id + '\'' +
                ", ram=" + ram +
                ", disco=" + disco +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }
}
