package strategyVacuna;

public class Main {
    public static void main(String[] args) {
        Persona p1= new Persona("Alexis");
        Vacuna v1= new Vacuna(new Astrazeneca());
        v1.vacunar(p1);
        p1.cantidadDosisDadas();
        v1.vacunar(p1);

        Persona p2= new Persona("Juan");
        Vacuna v2= new Vacuna(new Sputnik());
        v2.vacunar(p2);
        p2.cantidadDosisDadas();
        v2.vacunar(p2);
        v2.vacunar(p2);
    }
}
