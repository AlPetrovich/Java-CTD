package bimestreTres.flyweightArboles;

import java.util.Objects;

public class Arbol {

    private double alto;
    private double ancho;
    private String color;
    private String tipoArbol;

    public Arbol(double alto, double ancho, String color, String tipoArbol) {
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
        this.tipoArbol = tipoArbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Arbol)) return false;
        Arbol arbol = (Arbol) o;
        return Double.compare(arbol.alto, alto) == 0 && Double.compare(arbol.ancho, ancho) == 0 && color.equals(arbol.color) && tipoArbol.equals(arbol.tipoArbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alto, ancho, color, tipoArbol);
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", color='" + color + '\'' +
                ", tipoArbol='" + tipoArbol + '\'' +
                '}';
    }
}
