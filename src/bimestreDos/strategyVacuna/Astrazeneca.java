package strategyVacuna;

public class Astrazeneca implements EstrategiaVacuna{
    private final String ORIGEN= "Inglaterra";
    private final int CANTDOSIS=1;

    @Override
    public void vacunar(Persona p) {
        if (p.cantidadDosisDadas()<1){
            p.incrementarDosis();
            System.out.println("El paciente: "+p.getNombre()+" esta totalmente vacunado con una monodosis de "+ this.getClass().getSimpleName());
        }else{
            System.out.println("El paciente: "+p.getNombre()+" ya se encuentra vacunado con "+ this.getClass().getSimpleName());
        }
    }
}
