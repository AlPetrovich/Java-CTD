package facadeTurismo;

import java.util.Objects;

public class Hotel {
    private String nombre;
    private String fechaSalida;
    private String fechaRegreso;
    private String ciudad;

    public Hotel(String fechaSalida, String fechaRegreso, String ciudad) {
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.ciudad = ciudad;
    }

    public Hotel(String nombre, String fechaSalida, String fechaRegreso, String ciudad) {
        this.nombre = nombre;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.ciudad = ciudad;
    }

    public void mostrarInformacion(){
        System.out.println(nombre);
        System.out.println("\tFecha salida:\t" + fechaSalida +
                "\n\tFecha regreso:\t" + fechaRegreso +
                "\n\tCiudad:\t" + ciudad);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(fechaSalida, hotel.fechaSalida) && Objects.equals(fechaRegreso, hotel.fechaRegreso) && Objects.equals(ciudad, hotel.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaSalida, fechaRegreso, ciudad);
    }
}
