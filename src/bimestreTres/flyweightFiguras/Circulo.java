package bimestreTres.flyweightFiguras;

public class Circulo {

    private String color;
    private double radio;
    private String tamaño;

    //color es la parte compartida
    public Circulo(String color) {
        this.color = color;
    }

    public void dibujar(){
        System.out.println("Dibujamos objeto color: " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
