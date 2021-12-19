package strategyVacuna;

public class Moderna implements EstrategiaVacuna{
    private final String ORIGEN="EEUU";
    private final int CANTDOSIS=2;

    @Override
    public void vacunar(Persona p) {
        if (p.cantidadDosisDadas()<2){
            p.incrementarDosis();
            if (p.cantidadDosisDadas()==2){
                System.out.println("El paciente: "+p.getNombre()+" Ya esta totalmente vacunado con "+this.getClass().getSimpleName());
            }else{
                System.out.println("Al paciente: "+p.getNombre()+" Le falta 1 dosis de "+ this.getClass().getSimpleName());
            }
        }else{
            System.out.println("El paciente "+ p.getNombre()+" Ya se encuentra totalmente vacunado con "+ this.getClass().getSimpleName());
        }
    }
}
